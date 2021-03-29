package BitManipulation.easy.q191;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/number-of-1-bits/
 */
public class Solution3 {
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;
    }
}
