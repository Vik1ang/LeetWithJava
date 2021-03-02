package String.easy.q709;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/to-lower-case/
 */
public class Solution2 {
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                stringBuffer.append((char) (c + 32));
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
