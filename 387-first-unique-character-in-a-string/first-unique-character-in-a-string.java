class Solution {
    public int firstUniqChar(String s) {
    for(int i = 0; i<s.length() ; i++){
        char currentChar = s.charAt(i);
       if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
                return i;
            }
        }
        return -1;
    }
}