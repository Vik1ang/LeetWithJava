package array.easy.q1534;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/count-good-triplets/
 */
public class Solution2 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        int n = arr.length;
        int[] sum = new int[1001];
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (Math.abs(arr[j] - arr[k]) <= b) {
                    int lj = arr[j] - a;
                    int rj = arr[j] + a;
                    int lk = arr[k] - c;
                    int rk = arr[k] + c;
                    int l = Math.max(0, Math.max(lj, lk));
                    int r = Math.min(1000, Math.min(rj, rk));
                    if (l <= r) {
                        if (l == 0) {
                            ans += sum[r];
                        } else {
                            ans += sum[r] - sum[l - 1];
                        }
                    }
                }
            }
            for (int k = arr[j]; k <= 1000; k++) {
                ++sum[k];
            }
        }
        return ans;
    }
}
