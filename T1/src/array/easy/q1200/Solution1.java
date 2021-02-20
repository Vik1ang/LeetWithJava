package array.easy.q1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-absolute-difference/
 */
public class Solution1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == min) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(arr[i]);
                arrayList.add(arr[i + 1]);
                res.add(arrayList);
            }
        }
        return res;
    }
}
