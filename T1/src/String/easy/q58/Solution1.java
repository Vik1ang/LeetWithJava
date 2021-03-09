package String.easy.q58;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/length-of-last-word/
 */
public class Solution1 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0 ) {
            return 0;
        }
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }
}
