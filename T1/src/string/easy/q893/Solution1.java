package string.easy.q893;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/groups-of-special-equivalent-strings/
 */
public class Solution1 {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> hashSet = new HashSet<>();
        for (String s : A) {
            int[] count = new int[52];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            hashSet.add(Arrays.toString(count));
        }
        return hashSet.size();
    }
}
