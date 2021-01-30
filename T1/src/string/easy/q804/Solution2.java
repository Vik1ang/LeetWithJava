package string.easy.q804;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/unique-morse-code-words/
 */
public class Solution2 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<Object> hashSet = new HashSet<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(MORSE[c - 'a']);
            }
            hashSet.add(builder.toString());
        }
        return hashSet.size();
    }
}
