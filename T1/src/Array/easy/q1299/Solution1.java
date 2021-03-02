package Array.easy.q1299;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class Solution1 {
    public int[] replaceElements(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                res[i] = -1;
                break;
            }
            res[i] = list.subList(i + 1, arr.length)
                    .stream()
                    .mapToInt(e -> e)
                    .max()
                    .getAsInt();
        }
        return res;
    }
}
