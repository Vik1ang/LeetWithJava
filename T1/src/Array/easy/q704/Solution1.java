package Array.easy.q704;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public int search(int[] nums, int target) {
        int L = 0, R = nums.length - 1;
        int mid;
        while (L <= R) {
            mid = L + (R - L) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return -1;
    }
}
