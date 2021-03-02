package Array.easy.q1122;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/relative-sort-array/
 */
public class Solution2 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr1) {
            arrayList.add(i);
        }
        for (int i = 0; i < arr2.length; i++) {
            hashMap.put(arr2[i], i);
        }
        Collections.sort(arrayList, (x,y) -> {
            if (hashMap.containsKey(x) || hashMap.containsKey(y)) {
                return hashMap.getOrDefault(x, 1001) - hashMap.getOrDefault(y, 1001);
            }
            return x - y;
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arrayList.get(i);
        }
        return arr1;
    }
}
