package String.easy.q1374;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 */
public class Solution2 {
    // Can't work for JDK1.8(8)
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n == 1) {
            return "a";
        }
        if (n % 2 == 0) {
            stringBuilder.append("a".repeat(Math.max(0, n - 1)));
            stringBuilder.append("b");
        } else {
            stringBuilder.append("a");
            stringBuilder.append("b");
            stringBuilder.append("c".repeat(Math.max(0, n - 2)));
        }
        return stringBuilder.toString();
    }
}
