package BitManipulation.easy;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/number-of-1-bits/
 */
public class Solution2 {
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
