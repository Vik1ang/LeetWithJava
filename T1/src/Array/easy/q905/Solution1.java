package Array.easy.q905;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-array-by-parity/
 */
public class Solution1 {
    public int[] sortArrayByParity(int[] A) {
        Deque<Integer> deque = new LinkedList<>();
        for (int num : A) {
            if ((num & 1) == 1) {
                deque.addLast(num);
            } else {
                deque.addFirst(num);
            }
        }
        return deque.stream().mapToInt(e -> e).toArray();
    }
}
