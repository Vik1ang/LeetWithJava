package String.easy.q344;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-string/
 */
public class Solution1 {
    public void reverseString(char[] s) {
        int from = 0;
        int to = s.length - 1;
        while (from < to) {
            char temp = s[from];
            s[from++] = s[to];
            s[to--] = temp;
        }
    }
}
