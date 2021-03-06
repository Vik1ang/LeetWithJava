package Array.easy.q122;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
