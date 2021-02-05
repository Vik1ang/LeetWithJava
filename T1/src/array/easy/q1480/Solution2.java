package array.easy.q1480;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class Solution2 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
