package array.easy.q1475;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class Solution1 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] res = prices.clone();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[i] - prices[j] >= 0) {
                    res[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return res;
    }
}
