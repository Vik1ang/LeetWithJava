package String.easy.q1309;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class Solution1 {
    public String freqAlphabets(String s) {
        char[] alphabet = new char[27];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (i + 96);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                builder.append(alphabet[(chars[i] - '0') * 10 + chars[i + 1] - '0']);
                i += 2;
            } else {
                builder.append(alphabet[chars[i] - '0']);
            }
        }
        return builder.toString();
    }
}
