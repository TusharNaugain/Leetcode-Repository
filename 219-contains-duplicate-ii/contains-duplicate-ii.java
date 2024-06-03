import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a hashmap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the value already exists in the hashmap
            if (map.containsKey(nums[i])) {
                // Check if the difference between indices is less than or equal to k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the hashmap with the current index
            map.put(nums[i], i);
        }
        
        // If no such pair is found, return false
        return false;
    }

}