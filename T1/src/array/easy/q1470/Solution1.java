package array.easy.q1470;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/shuffle-the-array/
 */
public class Solution1 {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(nums[i]);
            arrayList.add(nums[n + i]);
        }
        return arrayList.stream().mapToInt(e -> e).toArray();
    }
}
