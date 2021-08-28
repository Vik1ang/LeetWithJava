package Array.easy.q35;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int L = 0, R = nums.length - 1, ans = nums.length;
        int mid;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (nums[mid] >= target) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return ans;
    }
}
