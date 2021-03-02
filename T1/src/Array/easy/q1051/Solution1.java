package Array.easy.q1051;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/height-checker/
 */
public class Solution1 {
    public int heightChecker(int[] heights) {
        List<Integer> copy = Arrays.stream(heights).boxed().collect(Collectors.toList());
        copy.sort(Comparator.naturalOrder());
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (copy.get(i) == heights[i]) {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
