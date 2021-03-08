package HashTable.medium.q451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class Solution3 {
    public String frequencySort(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new List[s.length() + 1];
        for (char key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<Character>();
            }
            buckets[value].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (char j : buckets[i]) {
                    for (int k = i; k > 0; k--) {
                        sb.append(j);
                    }
                }
            }
        }
        return sb.toString();
    }
}
