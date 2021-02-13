package DynamicProgramming.hard.q72;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/edit-distance/
 */
public class Solution2 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // empty
        if (n * m == 0) {
            return n + m;
        }

        // dp
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = j;
        }

        // dp
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int del = dp[i - 1][j] + 1;
                int insert = dp[i][j - 1] + 1;
                int replace = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    replace += 1;
                }
                dp[i][j] = Math.min(del, Math.min(insert, replace));
            }
        }
        return dp[n][m];
    }
}
