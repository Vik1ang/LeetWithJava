package Array.easy.q217;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
