package String.easy.q1556;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/thousand-separator/
 */
public class Solution1 {
    public String thousandSeparator(int n) {
        if (String.valueOf(n).length() <= 3) {
            return String.valueOf(n);
        }
        StringBuilder stringBuilder = new StringBuilder().append(n).reverse();
        StringBuilder res = new StringBuilder();
        while (true) {
            res.append(stringBuilder.substring(0, 3) + ".");
            if (stringBuilder.substring(3).length() <= 3) {
                res.append(stringBuilder.substring(3));
                break;
            }
            stringBuilder = stringBuilder.delete(0, 3);
        }
        return res.reverse().toString();
    }
}
