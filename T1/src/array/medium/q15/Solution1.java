package array.medium.q15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/3sum/
 */
public class Solution1 {
    // time limit exceeded
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.sort(Comparator.naturalOrder());
                        if (!res.contains(temp)) {
                            res.add(temp);
                        }
                    }
                }
            }
        }
        return res;
    }
}
