class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k){
        return -1;
        }

    int high = bloomDay[0];
    int low = bloomDay[0];
    for(int i = 0 ; i<bloomDay.length ; i++){
        if(low>bloomDay[i]){
            low = bloomDay[i];
        }
        if(high<bloomDay[i]){
            high = bloomDay[i];
        }
    }
    int res = -1;
    while(high>=low){
        int mid = (low+high)/2;
       if(isPossible(bloomDay, m , k , mid)){
        res = mid;
        high = mid-1;
       }else{
        low= mid+1;
       }
       }
        return res;
    }

    private boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int flowers = 0;
        int bouquets = 0;
    
        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset flowers count if the bloom day is greater than 'mid'
            }

            if (bouquets >= m) {
                return true;
            }
        }
        return false;
    }
}