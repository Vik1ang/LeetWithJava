package Array.easy.q1385;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */
public class Solution2 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int x : arr1) {
            boolean ok = true;
            for (int y : arr2) {
                ok &= Math.abs(x - y) > d;
            }
            cnt += ok ? 1 : 0;
        }
        return cnt;
    }
}
