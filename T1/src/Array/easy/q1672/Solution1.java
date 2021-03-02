package Array.easy.q1672;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/richest-customer-wealth/
 */
public class Solution1 {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }
            max = Integer.max(curr, max);
        }
        return max;
    }
}
