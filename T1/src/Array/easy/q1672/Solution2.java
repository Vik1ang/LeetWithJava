package Array.easy.q1672;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/richest-customer-wealth/
 */
public class Solution2 {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(num -> Arrays.stream(num).sum())
                .max(Integer::compareTo).get();
    }
}
