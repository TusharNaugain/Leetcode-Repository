class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k%n;
        Deque<Integer>deque = new LinkedList<>();
        for(int num:nums){
            deque.addLast(num);
        }

        for(int i = 0; i<k ; i++){
           int lastElement =  deque.pollLast();
           deque.addFirst(lastElement);
        }
        int index = 0;
        for(int num : deque){
            nums[index++]= num;
        }

    }
}