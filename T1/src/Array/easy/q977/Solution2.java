package Array.easy.q977;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Solution2 {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(e -> e * e).sorted().toArray();
    }
}
