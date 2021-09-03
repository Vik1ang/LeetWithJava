package JianzhiOffer.easy.q10;

/**
 * @author Vikiang
 * @URL
 */

// exceed time limit
public class Solution1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
