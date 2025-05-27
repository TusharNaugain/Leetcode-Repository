class Solution {
    public int minDistance(String word1, String word2) {
        final int m = word1.length();
        final int n = word2.length();
        
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;  // Deletion
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;  // Insertion
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];  // No operation needed
                } else {
                    int replace = dp[i - 1][j - 1]; // Replace operation
                    int delete = dp[i - 1][j];     // Delete operation
                    int insert = dp[i][j - 1];     // Insert operation
                    dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
                }
            }
        }

        return dp[m][n];
    }
}
