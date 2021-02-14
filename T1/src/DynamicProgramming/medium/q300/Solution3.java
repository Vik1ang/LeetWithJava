package DynamicProgramming.medium.q300;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class Solution3 {
    public int lengthOfLIS(int[] nums) {
        int len = 1;
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] d = new int[n + 1];
        d[len] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > d[len]) {
                d[++len] = nums[i];
            } else {
                int l = 1;
                int r = len;
                int pos = 0;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                d[pos + 1] = nums[i];
            }
        }
        return len;
    }
}
