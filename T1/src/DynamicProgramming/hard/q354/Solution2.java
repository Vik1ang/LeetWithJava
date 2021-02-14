package DynamicProgramming.hard.q354;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/russian-doll-envelopes/
 */
public class Solution2 {
    public int maxEnvelopes(int[][] envelopes) {
        // Arrays.sort(envelopes, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] o1, int[] o2) {
        //         if (o1[0] == o2[0]) {
        //             return o2[1] - o1[1];
        //         } else {
        //             return o1[0] - o2[0];
        //         }
        //     }
        // });
        Arrays.sort(envelopes, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int[] secondDim = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            secondDim[i] = envelopes[i][1];
        }
        return lengthOfLIS(secondDim);
    }

    private int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
