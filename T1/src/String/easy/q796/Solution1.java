package String.easy.q796;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/rotate-string/
 */
public class Solution1 {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().equals(B)) {
                return true;
            }
        }
        return false;
    }
}
