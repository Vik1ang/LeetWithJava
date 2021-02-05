package array.easy.q1470;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/shuffle-the-array/
 */
public class Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[i + 1];
        }
        return res;
    }
}
