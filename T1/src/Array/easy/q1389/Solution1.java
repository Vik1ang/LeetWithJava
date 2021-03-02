package Array.easy.q1389;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
public class Solution1 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i], nums[i]);
        }
        return arrayList.stream().mapToInt(e->e).toArray();
    }
}
