package String.easy.q1614;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class Solution2 {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int max = 0;
        for (char aChar : chars) {
            if (aChar == ')') {
                stack.pop();
            } else if (aChar == '(') {
                stack.push(aChar);
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}
