class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length - 1];

        while (start < end) {
            int mid = start + (end - start) / 2;

            int speed = 0;
            for (int i = 0; i < piles.length; i++) {
                speed += (int) Math.ceil((double) piles[i] / (double) mid);
            }

            if (speed <= h) {
                end = mid;  // Update end to mid, not mid - 1
            } else {
                start = mid + 1;
            }
        }
        return start;  // Start will hold the minimum eating speed
    }
}