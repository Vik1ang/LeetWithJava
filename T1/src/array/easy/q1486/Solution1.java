package array.easy.q1486;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class Solution1 {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + 2 * i;
            res ^= arr[i];
        }
        return res;
    }

}
