package string.easy.q1374;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 */
public class Solution1 {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n == 1) {
            return "a";
        }
        if (n % 2 == 0) {
            // n = 6
            // a a a a a b
            // 0 1 2 3 4 5
            for (int i = 0; i < n - 1; i++) {
                stringBuilder.append("a");
            }
            stringBuilder.append("b");
        } else {
            // n = 7
            // a b c c c c c
            stringBuilder.append("a");
            stringBuilder.append("b");
            for (int i = 2; i < n; i++) {
                stringBuilder.append("c");
            }
        }
        return stringBuilder.toString();
    }
}
