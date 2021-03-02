package Array.easy.q1266;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-time-visiting-all-points/
 */
public class Solution1 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int dx = Math.abs(points[i][0] - points[i + 1][0]);
            int dy = Math.abs(points[i][1] - points[i + 1][1]);
            res += dx >= dy ? dx : dy;
        }
        return res;
    }
}
