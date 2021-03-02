package Array.easy.q1295;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Math.floor(Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
