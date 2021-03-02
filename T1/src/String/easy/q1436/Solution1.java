package String.easy.q1436;

import java.util.HashMap;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/destination-city/
 */
public class Solution1 {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (List<String> path : paths) {
            hashMap.put(path.get(0), path.get(1));
        }
        String key = paths.get(0).get(0);
        while (hashMap.containsKey(key)) {
            String value = hashMap.get(key);
            key = value;
        }
        return key;
    }
}
