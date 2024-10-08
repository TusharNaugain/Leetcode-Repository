class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1; i<=9; i++){
            int n = i;
            int next = i+1;
            while(n<=high && next<=9){
                n = n*10+next;
                if(n>=low && n<=high){
                    res.add(n);
                }
                next++;
            }
        }
            res.sort(null);
            return res;
}
}