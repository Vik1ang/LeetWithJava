package String.easy.q917;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution3 {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetter(chars[i])) {
                i++;
                continue;
            }
            if (!Character.isLetter(chars[j])) {
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
