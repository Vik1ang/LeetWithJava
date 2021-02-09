package array.easy.q561;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/array-partition-i/
 */
public class Solution1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int pair = nums.length / 2;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
