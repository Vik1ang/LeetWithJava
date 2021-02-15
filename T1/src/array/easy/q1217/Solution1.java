package array.easy.q1217;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 */
public class Solution1 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int num : position) {
            if ((num & 1) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}
