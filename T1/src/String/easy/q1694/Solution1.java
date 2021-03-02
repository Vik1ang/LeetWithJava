package String.easy.q1694;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reformat-phone-number/
 */
public class Solution1 {
    public String reformatNumber(String number) {
        number = number.replaceAll("-", "");
        number = number.replaceAll(" ", "");
        StringBuilder builder = new StringBuilder();
        while (true) {
            if (number.length() > 4) {
                String str = number.substring(0, 3);
                builder.append(str + "-");
                number = number.substring(3);
            } else {
                if (number.length() == 4) {
                    builder.append(number.substring(0, 2) + "-" + number.substring(2));
                } else {
                    builder.append(number);
                }
                break;
            }
        }
        return builder.toString();
    }
}
