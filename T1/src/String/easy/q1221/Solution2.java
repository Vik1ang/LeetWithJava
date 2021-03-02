package String.easy.q1221;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution2 {
    public int balancedStringSplit(String s) {
        int num = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                num++;
            } else {
                num--;
            }
            if (num == 0) {
                res++;
            }
        }
        return res;
    }
}
