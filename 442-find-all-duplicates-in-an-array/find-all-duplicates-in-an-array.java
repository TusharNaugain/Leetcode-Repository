class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> set = new ArrayList<>();
    Arrays.sort(nums); //[1,2,2,3,3,4,7,8]
    for(int i = 1; i<nums.length; i++){
        if(nums[i-1]==nums[i]){
            set.add(nums[i]);
        }
    }return set;
    }
}