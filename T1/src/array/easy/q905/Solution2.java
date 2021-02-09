package array.easy.q905;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-array-by-parity/
 */
public class Solution2 {
    public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; t++) {
            B[t] = A[t];
        }
        Arrays.sort(B, (a, b) -> Integer.compare(a % 2, b % 2));
        for (int t = 0; t < A.length; t++) {
            A[t] = B[t];
        }
        return A;
    }
}
