class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five_dollars = 0, ten_dollars=0;
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                five_dollars++;
            }else if(bills[i]==10){
                if(five_dollars>0){
                    five_dollars--;
                    ten_dollars++;
                }else{
                return false;
                }
            }else{
                if(five_dollars >0 && ten_dollars >0){
                    five_dollars--;
                    ten_dollars--;

                }else if(five_dollars>2){
                    five_dollars-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}