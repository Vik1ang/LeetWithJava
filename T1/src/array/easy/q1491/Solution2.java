package array.easy.q1491;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/`
 */
public class Solution2 {
    public double average(int[] salary) {
        double sum = 0;
        double maxValue = Integer.MIN_VALUE;
        double minValue = Integer.MAX_VALUE;
        for (int num : salary) {
            sum += num;
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return (sum - maxValue - minValue) / (salary.length - 2);
    }
}
