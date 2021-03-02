package String.easy.q521;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-uncommon-subsequence-i/
 */
public class Solution1 {
    // exceed time limit
    public int findLUSlength(String a, String b) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : new String[]{a, b}) {
            for (int i = 0; i < (1 << s.length()); i++) {
                String t = "";
                for (int j = 0; j < s.length(); j++) {
                    if (((i >> j) & 1) != 0) {
                        t += s.charAt(j);
                    }
                }
                if (hashMap.containsKey(t)) {
                    hashMap.put(t, hashMap.get(t) + 1);
                } else {
                    hashMap.put(t, 1);
                }
            }
        }
        int res = -1;
        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) == 1) {
                res = Math.max(res, s.length());
            }
        }
        return res;
    }
}
