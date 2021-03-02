package Array.easy.q1502;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class Solution2 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] * 2 != arr[i - 1] + arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
