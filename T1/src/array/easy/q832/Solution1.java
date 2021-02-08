package array.easy.q832;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/flipping-an-image/
 */
public class Solution1 {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (C + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = temp;
            }
        }
        return A;
    }
}
