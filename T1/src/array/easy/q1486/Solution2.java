package array.easy.q1486;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class Solution2 {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= (start + i * 2);
        }
        return ans;
    }
}
