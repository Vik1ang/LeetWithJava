package Array.easy.q1304;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class Solution2 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = -i;
            ans[index++] = i;
        }
        return ans;
    }
}
