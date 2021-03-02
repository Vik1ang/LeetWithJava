package Array.easy.q122;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class Solution3 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp0 = 0;
        int dp1 = -prices[0];
        for (int i = 0; i < n; i++) {
            int newDp0 = Math.max(dp0, dp1 + prices[i]);
            int newDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }
        return dp0;
    }
}
