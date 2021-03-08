package HashTable.medium.q451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class Solution2 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        entries.sort((((o1, o2) -> o2.getValue() - o1.getValue())));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            sb.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }
        return sb.toString();
    }
}
