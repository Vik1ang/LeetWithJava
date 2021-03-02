package Array.easy.q1572;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class Solution1 {
    public int diagonalSum(int[][] mat) {
        int primary = 0;
        int secondary = 0;
        int len = mat.length;
        int primaryI = 0;
        int secI = len - 1;
        int minus = 0;
        for (int i = 0; i < len; i++) {
            if (primaryI == secI) {
                minus += mat[i][primaryI];
                primaryI++;
                secI--;
                continue;
            }
            primary += mat[i][primaryI++];
            secondary += mat[i][secI--];
        }
        return primary + secondary - minus;
    }
}
