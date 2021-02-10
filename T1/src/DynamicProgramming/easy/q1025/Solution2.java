package DynamicProgramming.easy.q1025;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/divisor-game/
 */
public class Solution2 {
    public boolean divisorGame(int N) {
        boolean[] f = new boolean[N + 1];

        f[1] = false;
        if (N <= 1) {
            return false;
        }
        f[2] = true;
        for (int i = 3; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0 && !f[i - j]) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[N];
    }
}
