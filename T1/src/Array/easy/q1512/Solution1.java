package Array.easy.q1512;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/number-of-good-pairs/
 */
public class Solution1 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
