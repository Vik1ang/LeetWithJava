package String.easy.q1108;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/defanging-an-ip-address/
 */
public class Solution3 {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == '.') {
                builder.append("[.]");
            } else {
                builder.append(aChar);
            }
        }
        return builder.toString();
    }
}
