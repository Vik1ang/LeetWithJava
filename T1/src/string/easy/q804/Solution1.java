package string.easy.q804;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/unique-morse-code-words/
 */
public class Solution1 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] strings = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashMap<Character, String> hashMap = new HashMap<>();
        char a = 'a' - 1;
        for (String string : strings) {
            a += 1;
            hashMap.put(a, string);
        }
        HashSet<String> hashSet = new HashSet<>();
        for (String word : words) {
            String s = "";
            for (char c : word.toCharArray()) {
                s += hashMap.get(c);
            }
            hashSet.add(s);
        }
        return hashSet.size();
    }
}
