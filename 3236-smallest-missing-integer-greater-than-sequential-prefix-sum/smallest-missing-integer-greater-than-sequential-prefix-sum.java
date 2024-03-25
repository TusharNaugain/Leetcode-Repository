class Solution {
    public int missingInteger(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int sum = nums[0];
        int maxSum = nums[0];
        for(int num : nums){
            set.add(num);
        }
    for(int i = 1; i<nums.length ; i++){
        if(nums[i]- nums[i-1]==1){
            sum+=nums[i];
        }else{
            sum = 0;
        }
    maxSum = Math.max(maxSum, sum);
    if(maxSum == nums[0]){
        while(set.contains(maxSum)){
            maxSum++;
        }
        return maxSum;
    }
    }
    while(set.contains(maxSum)){
        maxSum++;
    }
    return maxSum;
    }
}