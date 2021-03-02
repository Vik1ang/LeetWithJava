package String.easy.q1309;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class Solution3 {
    public String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                builder.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i += 3;
            } else {
                builder.append((char) ('a' + Integer.parseInt(s.substring(i, i + 1)) - 1));
                i++;
            }
        }
        return builder.toString();
    }
}
