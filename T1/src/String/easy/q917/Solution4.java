package String.easy.q917;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution4 {
    public String reverseOnlyLetters(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j))) {
                    j--;
                }
                stringBuilder.append(S.charAt(j--));
            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
