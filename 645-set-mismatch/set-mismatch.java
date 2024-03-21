class Solution {
    public int[] findErrorNums(int[] nums) {
        int miss = 0;
        int dup= 0;
        for(int i = 1 ; i<=nums.length ; i++){
            int count = 0;
        for( int j = 0;j<nums.length ; j++){
        if(nums[j]==i){
            count++;
        }
        }
        if(count == 0 ){
            miss = i;
        }else if(count ==2){
            dup = i;
            }
        }
        return new int[]{dup,miss};
    }
    }

    