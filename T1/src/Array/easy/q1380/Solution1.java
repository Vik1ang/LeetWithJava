package Array.easy.q1380;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 */
public class Solution1 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            System.out.println("index: " + index);
            System.out.println("min: " + min);
            boolean flag = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][index] > min) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(matrix[i][index]);
            }
        }
        return result;
    }
}
