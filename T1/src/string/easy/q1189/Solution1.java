package string.easy.q1189;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-number-of-balloons/
 */
public class Solution1 {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('b', 0);
        hashMap.put('a', 0);
        hashMap.put('l', 0);
        hashMap.put('o', 0);
        hashMap.put('n', 0);
        for (char c : text.toCharArray()) {
            if (hashMap.containsKey(c)) {
                Integer temp = hashMap.get(c);
                hashMap.put(c, ++temp);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        Integer min = Integer.MAX_VALUE;
        Integer lNum = hashMap.get('l');
        hashMap.put('l', lNum / 2);
        Integer oNum = hashMap.get('o');
        hashMap.put('o', oNum / 2);
        for (Map.Entry<Character, Integer> entry : entries) {
            min = Math.min(entry.getValue(), min);
        }
        return min;

    }
}
