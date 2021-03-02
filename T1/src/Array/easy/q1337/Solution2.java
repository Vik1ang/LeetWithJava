package Array.easy.q1337;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class Solution2 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            res[i][0] = i;
            res[i][1] = sum;
        }
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] ans = new int[k];
        int i = 0;
        for (int[] re : res) {
            if (i >= k) {
                break;
            }
            ans[i++] = re[0];
        }
        return ans;
    }
}
