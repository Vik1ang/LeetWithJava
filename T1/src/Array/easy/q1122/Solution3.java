package Array.easy.q1122;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/relative-sort-array/
 */
public class Solution3 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int i : arr1) {
            upper = Math.max(upper, i);
        }
        int[] frequency = new int[upper + 1];
        for (int i : arr1) {
            frequency[i]++;
        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for (int i : arr2) {
            for (int j = 0; j < frequency[i]; j++) {
                ans[index++] = i;
            }
            frequency[i] = 0;
        }
        for (int i = 0; i <= upper; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                ans[index++] = i;
            }
        }
        return ans;
    }
}
