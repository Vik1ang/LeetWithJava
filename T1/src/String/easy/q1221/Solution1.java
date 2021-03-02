package String.easy.q1221;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution1 {
    public int balancedStringSplit(String s) {
        int numR = 0;
        int numL = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                numR++;
            } else if (c == 'L') {
                numL++;
            }
            if (numL == numR && numL != 0) {
                res++;
            }
        }
        return res;
    }
}
