package Array.easy.q27;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-element/
 */
public class Solution1 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num != val) {
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}
