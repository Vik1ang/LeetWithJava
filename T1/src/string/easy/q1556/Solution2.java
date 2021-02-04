package string.easy.q1556;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/thousand-separator/
 */
public class Solution2 {
    public String thousandSeparator(int n) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int cur = n % 10;
            n /= 10;
            stringBuilder.append(cur);
            count++;
            if (count % 3 == 0 && n != 0) {
                stringBuilder.append('.');
            }
        } while (n != 0);
        return stringBuilder.reverse().toString();
    }
}
