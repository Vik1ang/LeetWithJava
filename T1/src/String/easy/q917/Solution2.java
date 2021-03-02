package String.easy.q917;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution2 {
    public String reverseOnlyLetters(String S) {
        Stack<Character> characters = new Stack<>();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                characters.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                ans.append(characters.pop());
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
