package Array.easy.q169;

public class Solution6 {
    public int majorityElement(int[] nums) {
        int max = 0;
        int num = nums[0];
        for (int n : nums) {
            if (max == 0) {
                num = n;
            }
            if (num == n) {
                max++;
            } else {
                max--;
            }
        }
        return num;
    }
}
