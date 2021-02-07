package array.easy.q1572;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class Solution3 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }
        return sum - mat[mid][mid] * (n & 1);
    }

}
