class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i <= 9; i++){
            int num = i;
            int nextnum = i + 1;

            while(num <= high && nextnum <= 9){
                num = num * 10 + nextnum;

                if(num >= low && num <= high){
                    arr.add(num);
                }

                nextnum++;
            }
        }

        arr.sort(null); // sort in increasing order
        return arr;     // return the final list
    }
}
