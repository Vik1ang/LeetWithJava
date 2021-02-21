package array.easy.q1636;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-array-by-increasing-frequency/
 */
public class Solution1 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int v : nums) {
            hashMap.put(v, hashMap.getOrDefault(v, 0) + 1);
        }
        int[] arr = Arrays.stream(nums).boxed().sorted((o1, o2) -> {
            int count1 = hashMap.get(o1);
            int count2 = hashMap.get(o2);
            return count1 == count2 ? o2 - o1 : count1 - count2;
        }).mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
