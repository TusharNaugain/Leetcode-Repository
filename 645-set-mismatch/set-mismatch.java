class Solution {
    public int[] findErrorNums(int[] nums) {
        int mis = 0;
        int dup = 0;
         for( int i = 1 ; i<=nums.length ; i++){
             int count = 0;
             for( int j = 0 ; j<nums.length ; j++){
                 if(nums[j] == i){
                     count++;
                 }
             }
                 if(count==0){
                     mis = i;
                 }else if( count ==2){
                     dup = i;
                 }
             }
        return new int[]{dup,mis};
         }
    
}