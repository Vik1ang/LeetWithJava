package array.easy.q1572;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class Solution2 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
