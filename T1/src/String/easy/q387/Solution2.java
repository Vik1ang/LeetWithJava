package String.easy.q387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class Solution2 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, -1);
            } else {
                hashMap.put(c, i);
            }
        }
        int first = n;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            int pos = entry.getValue();
            if (pos != -1 && pos < first) {
                first = pos;
            }
        }
        if (first == n) {
            return -1;
        } else {
            return first;
        }
    }
}
