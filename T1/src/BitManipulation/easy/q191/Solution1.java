package BitManipulation.easy.q191;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/number-of-1-bits/
 */
public class Solution1 {
    public int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
