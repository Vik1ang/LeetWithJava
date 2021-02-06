package array.easy.q1365;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class Solution1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
