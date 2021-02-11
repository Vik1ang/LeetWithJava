package DynamicProgramming.medium.q494;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/target-sum/
 */
public class Solution1 {
    int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        backTrack(nums, 0, S);
        return result;
    }

    private void backTrack(int[] nums, int i, int rest) {
        // base case
        if (i == nums.length) {
            if (rest == 0) {
                // success
                result++;
            }
            return;
        }

        rest += nums[i];
        backTrack(nums, i + 1, rest);
        rest -= nums[i];

        rest -= nums[i];
        backTrack(nums, i + 1, rest);
        rest += nums[i];
    }
}
