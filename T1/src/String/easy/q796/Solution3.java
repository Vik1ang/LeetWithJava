package String.easy.q796;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/rotate-string/
 */
public class Solution3 {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
