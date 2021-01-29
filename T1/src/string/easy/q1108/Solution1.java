package string.easy.q1108;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/defanging-an-ip-address/
 */
public class Solution1 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
