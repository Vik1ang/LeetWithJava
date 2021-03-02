package Array.easy.q1051;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/height-checker/
 */
public class Solution2 {
    public int heightChecker(int[] heights) {
        int[] newArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(newArr);
        int count = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
