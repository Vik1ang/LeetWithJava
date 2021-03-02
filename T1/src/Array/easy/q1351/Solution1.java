package Array.easy.q1351;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class Solution1 {
    public int countNegatives(int[][] grid) {
        int num = 0;
        for (int[] ints : grid) {
            int l = 0;
            int r = ints.length - 1;
            int pos = -1;
            while (l <= r) {
                int mid = l + ((r - l) >> 1);
                if (ints[mid] < 0) {
                    pos = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (~pos < 0) {
                num += ints.length - pos;
            }
        }
        return num;
    }
}
