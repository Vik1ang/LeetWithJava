package Array.easy.q1475;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class Solution2 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                prices[index] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}
