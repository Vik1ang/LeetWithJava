package Array.easy.q1480;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class Solution3 {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        int prevSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prevSum += nums[i];
            newArr[i] = prevSum;
        }
        return newArr;
    }
}
