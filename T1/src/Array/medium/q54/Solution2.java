package Array.medium.q54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/spiral-matrix/
 */
public class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int col = left; col <= right; col++) {
                order.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    order.add(matrix[bottom][col]);
                }
                for (int row = bottom; row > top; row--) {
                    order.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }
}
