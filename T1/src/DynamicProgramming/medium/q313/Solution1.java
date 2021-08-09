package DynamicProgramming.medium.q313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikiang
 * @URL
 */

// time limit exceed
public class Solution1 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n == 1) {
            return 1;
        }
        List<Integer> primesList = Arrays.stream(primes).boxed().collect(Collectors.toList());
        List<Integer> uglyList = new ArrayList<>();
        uglyList.add(1);
        int num = 2;
        do {
            if (isUgly(num, primesList)) {
                uglyList.add(num);
            }
            num++;

        } while (uglyList.size() <= n);
        return uglyList.get(n - 1);
    }

    private boolean isUgly(int num, List<Integer> primesList) {
        if (isPrime(num)) {
            return primesList.contains(num);
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0 && isPrime(i)) {
                    if (!primesList.contains(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
