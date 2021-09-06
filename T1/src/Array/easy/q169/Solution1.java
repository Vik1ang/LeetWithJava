package Array.easy.q169;

import java.util.HashMap;

public class Solution1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        int majority = 0;
        for (int num : nums) {
            Integer temp = hashMap.getOrDefault(num, 0);
            if (temp + 1 > count) {
                majority = num;
                count = temp + 1;
            }
            hashMap.put(num, temp + 1);

        }
        return majority;
    }
}
