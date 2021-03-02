package Array.easy.q1122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/relative-sort-array/
 */
public class Solution1 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> arr1List = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> arr2List = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr2List.size(); i++) {
            int find = arr2List.get(i);
            for (int j = 0; j < arr1List.size(); j++) {
                if (arr1List.get(j) == find) {
                    result.add(arr1List.get(j));
                }
            }
            while (arr1List.contains(find)) {
                arr1List.remove(Integer.valueOf(find));
            }
        }
        arr1List.sort(Comparator.naturalOrder());
        result.addAll(arr1List);
        return result.stream().mapToInt(e->e).toArray();
    }
}
