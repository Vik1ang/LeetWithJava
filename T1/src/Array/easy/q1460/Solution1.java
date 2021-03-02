package Array.easy.q1460;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 */
public class Solution1 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
