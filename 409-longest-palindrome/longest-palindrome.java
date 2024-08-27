class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                result+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
            }
            return (set.size()>0)?result+1:result;
             }
}