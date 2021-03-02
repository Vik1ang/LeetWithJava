package Array.easy.q1512;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/number-of-good-pairs/
 */
public class Solution2 {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int val = entry.getValue();
            count += val * (val - 1) / 2;
        }
        return count;
    }
}
