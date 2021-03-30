package Array.medium.q74;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        return list.contains(target);
    }
}
