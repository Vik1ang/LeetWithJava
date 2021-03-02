package Array.easy.q1304;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Solution1 {
    public int[] sumZero(int n) {
        int len = 0;
        if ((n & 1) == 1) {
            len = n - 1;
        } else {
            len = n;
        }
        int[] res = new int[n];
        int digit = 1;
        for (int i = 0; i < len; i+=2) {
            res[i] = digit;
            res[i + 1] = -digit;
            digit++;
        }
        return res;
    }
}
