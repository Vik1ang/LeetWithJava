package Array.easy.q1742;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 */
public class Solution1 {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            String str = String.valueOf(i);
            int count = 0;
            for (char a : str.toCharArray()) {
                count += a - '0';
            }
            hashMap.put(count, hashMap.getOrDefault(count, 0) + 1);
        }
        int max = -1;
        for (Integer value : hashMap.values()) {
            max = Integer.max(value, max);
        }
        return max;
        // return hashMap.values().stream().mapToInt(e->e).max().getAsInt();
    }
}
