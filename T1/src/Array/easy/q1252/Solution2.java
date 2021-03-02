package Array.easy.q1252;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class Solution2 {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];

        for (int[] index : indices) {
            row[index[0]] ^= 1;
            col[index[1]] ^= 1;
        }

        int rowNum = 0;
        int colNum = 0;

        for (int i : row) {
            if (i == 1) {
                rowNum++;
            }
        }

        for (int i : col) {
            if (i == 1) {
                colNum++;
            }
        }

        return rowNum * m + colNum * n - rowNum * colNum * 2;
    }
}
