package String.easy.q1221;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class Solution3 {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c == stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
