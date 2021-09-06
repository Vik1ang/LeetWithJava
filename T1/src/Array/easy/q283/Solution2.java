package Array.easy.q283;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0, fast = 0;
        while (fast < n) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        while (slow < n) {
            nums[slow++] = 0;
        }
    }
}
