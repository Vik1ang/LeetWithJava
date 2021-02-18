package array.easy.q1160;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class Solution2 {
    public int countCharacters(String[] words, String chars) {
        int[] alpha = new int[26];
        int result = 0;
        for (String word : words) {
            Arrays.fill(alpha, 0);
            for (int i = 0; i < chars.length(); i++) {
                alpha[chars.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (!flag) {
                    break;
                }
                int value = alpha[word.charAt(i) - 'a'];
                if (value > 0) {
                    alpha[word.charAt(i) - 'a']--;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                result += word.length();
            }
        }
        return result;
    }
}
