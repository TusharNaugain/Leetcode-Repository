class Solution {
    public void moveZeroes(int[] nums) {
       int countgt1 = 0;

       for(int i = 0; i<nums.length; i++){
        if(nums[i]!=0){
            nums[countgt1++] = nums[i];
        }
       }

       for(int i = countgt1; i<nums.length; i++){
        nums[i]=0;
       }
}
}