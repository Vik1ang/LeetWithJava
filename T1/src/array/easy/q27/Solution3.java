package array.easy.q27;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-element/
 */
public class Solution3 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
