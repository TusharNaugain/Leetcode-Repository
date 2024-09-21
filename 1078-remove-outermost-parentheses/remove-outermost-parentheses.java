class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                count++;
            } else {
                count--;
            }
            if (count == 1 && currentChar == '(') {
                continue;
            } else if (count == 0) {
                continue;
            } else {
                ans.append(currentChar);
            }
        }
        return ans.toString(); 
    }
}