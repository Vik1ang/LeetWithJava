package Array.medium.q162;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int findPeakElement(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[res]) {
                res = i;
            }
        }
        return res;
    }
}
