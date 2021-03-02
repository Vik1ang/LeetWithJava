package Array.easy.q1252;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class Solution1 {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < m; j++) {
                matrix[row][j]++;
            }
            for (int j = 0; j < n; j++) {
                matrix[j][col]++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
