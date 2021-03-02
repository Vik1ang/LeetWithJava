package String.easy.q1108;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/defanging-an-ip-address/
 */
public class Solution2 {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char aChar : chars) {
            if (aChar == '.') {
                stringBuffer.append("[.]");
            } else {
                stringBuffer.append(aChar);
            }
        }
        return stringBuffer.toString();
    }
}
