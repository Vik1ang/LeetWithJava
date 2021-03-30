package BitManipulation.easy.q190;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-bits/
 */
public class Solution1 {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
