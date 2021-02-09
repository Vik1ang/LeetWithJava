package array.easy.q905;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-array-by-parity/
 */
public class Solution3 {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ans[t++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                ans[t++] = A[i];
            }
        }
        return ans;
    }
}
