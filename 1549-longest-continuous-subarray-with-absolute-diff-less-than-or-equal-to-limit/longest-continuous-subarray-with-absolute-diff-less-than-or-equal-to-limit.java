
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        Deque<Integer> minQueue = new LinkedList<>();
        Deque<Integer> maxQueue = new LinkedList<>();
        int start = 0, end = 0;
    
        while (end < nums.length) {
            int x = nums[end];

           
            while (!minQueue.isEmpty() && nums[minQueue.peekLast()] >= x) {
                minQueue.pollLast();
            }
            minQueue.addLast(end);

           
            while (!maxQueue.isEmpty() && nums[maxQueue.peekLast()] <= x) {
                maxQueue.pollLast();
            }
            maxQueue.addLast(end);

            int mini = nums[minQueue.peekFirst()];
            int maxi = nums[maxQueue.peekFirst()];

            if (maxi - mini > limit) {
                start++;
                if (start > minQueue.peekFirst()) {
                    minQueue.pollFirst();
                }
                if (start > maxQueue.peekFirst()) {
                    maxQueue.pollFirst();
                }
            } else {
                ans = Math.max(ans, end - start + 1);
                end++;
            }
        }
        return ans;
    }
}
