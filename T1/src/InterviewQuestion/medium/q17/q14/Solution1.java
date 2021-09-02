package InterviewQuestion.medium.q17.q14;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int[] smallestK(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(res);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
