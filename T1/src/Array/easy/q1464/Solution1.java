package Array.easy.q1464;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class Solution1 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
