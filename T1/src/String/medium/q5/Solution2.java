package String.medium.q5;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Solution2 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            int oddLen = expandAroundCenter(chars, i, i);
            int evenLen = expandAroundCenter(chars, i, i + 1);

            int curMaxLen = Math.max(oddLen, evenLen);
            if (curMaxLen > maxLen) {
                maxLen = curMaxLen;
                begin = i - (maxLen - 1) / 2;
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    private int expandAroundCenter(char[] chars, int left, int right) {
        int len = chars.length;
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (chars[i] == chars[j]) {
                i--;
                j++;
            } else {
                break;
            }
        }
        return j - i - 1;
    }
}
