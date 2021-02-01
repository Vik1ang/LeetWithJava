package string.easy.q557;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class Solution1 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : split) {
            StringBuilder builder = new StringBuilder();
            stringBuilder.append(builder.append(s1).reverse());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
