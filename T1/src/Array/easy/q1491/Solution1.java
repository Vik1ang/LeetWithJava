package Array.easy.q1491;

import java.util.Arrays;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/`
 */
public class Solution1 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double count = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            count += salary[i];
        }
        return (double)(count/(salary.length - 2));
    }
}
