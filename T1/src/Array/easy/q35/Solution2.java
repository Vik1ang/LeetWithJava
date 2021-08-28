package Array.easy.q35;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int L = 0, R = nums.length - 1;
        int mid;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (nums[mid] < target) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return L;
    }
}
