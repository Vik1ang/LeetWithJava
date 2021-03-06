package Array.easy.q27;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-element/
 */
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
