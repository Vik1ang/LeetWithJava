package array.easy.q1337;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class Solution1 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            res[i][0] = i;
            res[i][1] = sum;
        }
        // Arrays.sort(res, (o1, o2) -> o1[1] - o2[1]);
        Arrays.sort(res, Comparator.comparingInt(o -> o[1]));
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = res[i][0];
        }
        return ans;
    }
}
