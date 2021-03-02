package String.easy.q824;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/goat-latin/
 */
public class Solution1 {
    public String toGoatLatin(String S) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("e");
        hashSet.add("i");
        hashSet.add("o");
        hashSet.add("u");
        String[] word = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            String first = word[i].substring(0, 1);
            if (hashSet.contains(first.toLowerCase())) {
                stringBuilder.append(word[i] + "ma" + "a".repeat(i + 1) + " ");
            } else {
                stringBuilder.append(word[i].substring(1) + first + "ma" + "a".repeat(i + 1) + " ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
