package DynamicProgramming.easy.q53;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }
}
