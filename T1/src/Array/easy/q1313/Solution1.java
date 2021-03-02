package Array.easy.q1313;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class Solution1 {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for (int j = 0; j < freq; j++) {
                arrayList.add(val);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
