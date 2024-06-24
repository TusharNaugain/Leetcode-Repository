class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        int flip = 0;

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }
            
            if (q.size() % 2 == nums[i]) {
                flip++;
                q.offer(i + k - 1); // Mark the end of flip effect
            
                if (i + k - 1 >= n) {
                    return -1; // Flip exceeds bounds of the array
                }
            }
        }

        return flip;
    }
}
