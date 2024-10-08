import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  
        
        HashSet<Integer> set = new HashSet<>();  
        int j = 0;  
        
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {  
                set.add(nums[i]);  
                nums[j] = nums[i];  
                j++;
            }
        }
        
        return j;  
    }
}
