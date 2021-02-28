package array.easy.q1;

import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/two-sum/
 */
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
