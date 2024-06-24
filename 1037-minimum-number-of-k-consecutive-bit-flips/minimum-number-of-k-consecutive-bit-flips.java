class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        int flip = 0;

        for (int i = 0; i < n; i++) {
            // Remove flip end markers that are no longer relevant
            while (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }

            if (q.size() % 2 == nums[i]) {
                if (i + k - 1 >= n) {
                    return -1; // Flip exceeds bounds of the array
                }
                flip++;
                q.offer(i + k - 1); // Mark the end of flip effect
            }
        }

        return flip;
    }
}
