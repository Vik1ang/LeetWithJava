package string.easy.q1332;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-palindromic-subsequences/
 */
public class Solution1 {
    public int removePalindromeSub(String s) {
        if (" ".equals(s)) {
            return 0;
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        }
        return 2;
    }
}
