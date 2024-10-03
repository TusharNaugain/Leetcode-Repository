class Solution {
    Boolean[][] cache;
    public boolean isInterleave(String s1, String s2, String s3) {
        cache = new Boolean[s1.length() + 1][s2.length() + 1];
        return find(s1, s2, s3, 0, 0, 0);
    }

    boolean find(String s1, String s2, String s3, int i, int j, int k) {
        if (k == s3.length())    return i == s1.length() && j == s2.length();
        if (cache[i][j] != null)    return cache[i][j];
        boolean ans = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k))    ans = find(s1, s2, s3, i + 1, j, k + 1);
        if (ans)    return ans;
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k))    ans = find(s1, s2, s3, i, j + 1, k + 1);
        cache[i][j] = ans;
        return ans;
    }
}