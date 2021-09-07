package JianzhiOffer.easy.q3;

import java.util.Arrays;

public class Solution2 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                return prev;
            }
            prev = nums[i];
        }
        return 0;
    }
}
