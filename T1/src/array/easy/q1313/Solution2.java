package array.easy.q1313;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class Solution2 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] res = new int[len];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                res[index++] = nums[i + 1];
            }
        }
        return res;
    }
}
