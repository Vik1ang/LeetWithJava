package array.easy.q1160;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class Solution1 {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (String word : words) {
            hashMap.clear();
            for (int i = 0; i < chars.length(); i++) {
                hashMap.put(chars.charAt(i), hashMap.getOrDefault(chars.charAt(i), 0) + 1);
            }
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (!flag) {
                    break;
                }
                if (hashMap.containsKey(word.charAt(i)) && hashMap.get(word.charAt(i)) > 0) {
                    hashMap.put(word.charAt(i), hashMap.get(word.charAt(i)) - 1);
                } else {
                    flag = false;
                }
            }
            if (flag) {
                count += word.length();
            }
        }
        return count;
    }
}
