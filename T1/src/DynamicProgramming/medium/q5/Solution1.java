package DynamicProgramming.medium.q5;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Solution1 {
    // time limit exceed
    public String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        String res = null;
        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = i + 1; j < dp[i].length; j++) {
                if (isPalindrome(s.substring(i, j)) && (j - i > max)) {
                    res = s.substring(i, j);
                    max = j - i;
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin <= end) {
            if (s.charAt(begin) != s.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
