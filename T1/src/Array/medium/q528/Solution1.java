package Array.medium.q528;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {

    int[] pre;
    int total;

    public Solution1(int[] w) {
        pre = new int[w.length];
        pre[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            pre[i] = pre[i - 1] + w[i];
        }
        total = Arrays.stream(w).sum();
    }

    public int pickIndex() {
        int x = (int) (Math.random() * total) + 1;
        return binarySearch(x);
    }

    private int binarySearch(int x) {
        int L = 0, R = pre.length - 1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (pre[mid] >= x) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}