package Array.easy.q121;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Solution1 {
    // Time Limit Exceeded
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}
