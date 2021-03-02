package String.easy.q709;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/to-lower-case/
 */
public class Solution3 {
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] |= 32;
        }
        return String.valueOf(chars);
    }
}
