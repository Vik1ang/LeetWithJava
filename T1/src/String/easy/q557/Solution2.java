package String.easy.q557;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution2 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s1 : split) {
            String s2 = reverseString(s1);
            builder.append(s2 + " ");
        }
        return builder.toString().trim();
    }

    private String reverseString(String s1) {
        char[] chars = s1.toCharArray();
        int from = 0;
        int to = chars.length - 1;
        while (from < to) {
            char temp = chars[from];
            chars[from++] = chars[to];
            chars[to--] = temp;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(chars);
        return builder.toString();
    }
}
