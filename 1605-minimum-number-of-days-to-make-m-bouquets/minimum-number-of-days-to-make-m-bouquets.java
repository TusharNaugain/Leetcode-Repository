class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // If it's impossible to create m bouquets with k flowers each
        if (m * k > bloomDay.length) {
            return -1;
        }

        // Find the minimum and maximum days in bloomDay
        int high = bloomDay[0];
        int low = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }
            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        int res = -1;
        // Binary search for the minimum number of days
        while (high >= low) {
            int mid = (low + high) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    // Helper method to check if it's possible to make m bouquets in mid days
    private boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset flowers count if the bloom day is greater than 'mid'
            }

            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }
}
