package Array.easy.q1748;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-unique-elements/
 */
public class Solution2 {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
