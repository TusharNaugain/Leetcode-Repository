class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
	for(int i=0; i<nums.length; i++){
		map.put(nums[i], map.getOrDefault(nums[i],0)+1);
	}

	int res = 0, max = 0;
	for(int key : map.values()){
		if(max < key){
			res = max = key;
		}else if(max == key){
			res += max;
		}
	}

	return res;
}
}