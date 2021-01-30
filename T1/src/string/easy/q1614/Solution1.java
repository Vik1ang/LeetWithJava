package string.easy.q1614;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class Solution1 {
    public int maxDepth(String s) {
        int max = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                num++;
            } else if (c == ')') {
                num--;
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
