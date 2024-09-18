class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        
   
        for(int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]); 
            end += weights[i];
        }
        

        while (start < end) {
            int mid = start + (end - start) / 2;
            int d = 1; 
            int sum = 0;
            
  
            for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] > mid) {
                    d++; 
                    sum = 0;
                }
                sum += weights[i];
            }
            
            
            if (d > days) {
                start = mid + 1; 
            } else {
                end = mid; 
            }
        }
        
        return start; 
    }
}
