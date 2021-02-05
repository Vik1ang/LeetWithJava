package array.easy.q922;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class Solution1 {
    public int[] sortArrayByParityII(int[] A) {
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> even = new LinkedList<>();
        for (int num : A) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                ans.add(even.pollFirst());
            } else {
                ans.add(odd.pollFirst());
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}
