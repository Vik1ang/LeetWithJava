package array.medium.q189;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/rotate-array/
 */
public class Solution1 {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i + k < length) {
                res[i + k] = nums[i];
            } else {
                res[(i + k) % length] = nums[i];
            }
        }
        for (int i = 0; i < length; i++) {
            nums[i] = res[i];
        }
    }
}
