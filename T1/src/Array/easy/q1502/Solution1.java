package Array.easy.q1502;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class Solution1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for (int i = 2; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
