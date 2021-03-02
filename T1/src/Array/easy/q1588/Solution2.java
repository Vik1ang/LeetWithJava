package Array.easy.q1588;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
public class Solution2 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j + i <= arr.length; j++) {
                for (int k = j; k < j + i; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}
