package Array.easy.q1534;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/count-good-triplets/
 */
public class Solution1 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
