package Array.easy.q1295;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution1 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
