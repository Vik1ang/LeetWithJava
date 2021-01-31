package string.easy.q1309;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class Solution2 {
    public String freqAlphabets(String s) {
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                int index = (chars[i] - '0') * 10 + (chars[i + 1] - '0');
                stringBuffer.append(alphabet[index - 1]);
                i += 2;
            } else {
                stringBuffer.append(alphabet[chars[i] - '0' - 1]);
            }
        }
        return stringBuffer.toString();
    }
}
