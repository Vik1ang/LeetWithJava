package array.easy.q1588;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
public class Solution1 {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int res = 0;

        for (int i = 0; i < len; i++) {
            int leftOdd = (i + 1) /2 ;
            int leftEven = i / 2 + 1;
            int rightOdd = (len - i) / 2;
            int rightEven = (len - 1 - i) / 2 + 1;
            res += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }
        return res;
    }

}
