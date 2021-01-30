package string.easy.q1684;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 */
public class Solution1 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> characters = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            characters.add(c);
        }
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toCharArray()) {
                if (!characters.contains(c)) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}
