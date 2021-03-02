package String.easy.q917;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution1 {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!(chars[i] >= 'A' && chars[i] <= 'Z') && !(chars[i] >= 'a' && chars[i] <= 'z')) {
                i++;
                continue;
            }
            if (!(chars[j] >= 'A' && chars[j] <= 'Z') && !(chars[j] >= 'a' && chars[j] <= 'z')) {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
