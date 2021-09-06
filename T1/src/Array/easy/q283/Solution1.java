package Array.easy.q283;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                res[index++] = num;
            }
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}
