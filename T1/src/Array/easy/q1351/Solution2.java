package Array.easy.q1351;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution2 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
