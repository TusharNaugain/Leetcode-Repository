class Solution {
    public String longestPalindrome(String s) {
        String ansString = "";

     
        for (int i = 0; i < s.length(); i++) {
            
            for (int j = i; j < s.length(); j++) {
       
                String substr = s.substring(i, j + 1);

               
                if (checkPalindrome(substr)) {
                    
                    if (ansString.length() < substr.length()) {
                        ansString = substr;
                    }
                }
            }
        }
        return ansString;
    }

    
    private boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

       
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  
            }
            left++;
            right--;
        }
        return true;
    }
}
