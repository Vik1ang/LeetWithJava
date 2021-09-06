package Array.easy.q26;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
