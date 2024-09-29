class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        backtrack(0, nums);
        return ans;
    }
    
    public void backtrack(int i, int[] nums) {
       if (i == nums.length) {
           List<Integer> list = new ArrayList<>();
           for (int n : nums) {
               list.add(n);
           }
           ans.add(list);
           return;
       } 
        
        for (int j=i; j<nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            backtrack(i+1, nums);

            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}