package DynamicProgramming.medium.q300;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class Solution2 {
    // DP
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        // base case
        Arrays.fill(dp, 1);
        int maxAns = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
