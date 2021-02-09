package array.easy.q1299;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class Solution2 {
    public int[] replaceElements(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            if (temp > rightMax) {
                rightMax = temp;
            }
        }
        return arr;
    }
}
