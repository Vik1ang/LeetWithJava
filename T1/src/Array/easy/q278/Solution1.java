package Array.easy.q278;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 extends VersionControl {
    public int firstBadVersion(int n) {
        int L = 1, R = n;
        int mid;
        while (L <= R) {
            mid = L + (R - L) / 2;
            if (isBadVersion(mid)) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}