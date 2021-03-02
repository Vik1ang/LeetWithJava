package Array.easy.q1732;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-the-highest-altitude/
 */
public class Solution1 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int temp = 0;
        for (int i : gain) {
            temp += i;
            max = Integer.max(temp, max);
        }
        return max;
    }
}
