package string.easy.q557;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution3 {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = s.length();
        int i = 0;
        while (i < len) {
            int start = i;
            while (i < len && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                stringBuilder.append(s.charAt(start + i - 1 - p));
            }
            while (i < len && s.charAt(i) == ' ') {
                i++;
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}
