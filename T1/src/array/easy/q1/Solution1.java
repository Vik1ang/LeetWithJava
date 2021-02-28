package array.easy.q1;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/two-sum/
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return res;
    }
}
