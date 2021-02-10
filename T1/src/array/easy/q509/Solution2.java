package array.easy.q509;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/fibonacci-number/
 */
public class Solution2 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return memorize(n);
    }

    private int memorize(int n) {
        int[] cache = new int[n + 1];
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
