class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0, maxNum = 0;
        for (int num : nums) {   
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        
        int left = maxNum, right = sum;
        
       
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
   
    private boolean canSplit(int[] nums, int k, int target) {
        int count = 1, currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > target) {
                count++;
                currentSum = num;
            }
            if (count > k) return false;
        }
        return true;
    }
}
