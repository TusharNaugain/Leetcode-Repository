class Solution {
    public String longestPalindrome(String s) {
        String ansString = "";
        for(int i=0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                String substr = s.substring(i, j+1);
                if(checkPalindrome(substr)){
                    if(substr.length()>ansString.length()){
                        ansString = substr;
                    }
                }
            }
        }
        return ansString; // don't forget to return the result
    }
    private boolean checkPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;  
            }
            low++;
            high--;
        }
        return true;
    }
}