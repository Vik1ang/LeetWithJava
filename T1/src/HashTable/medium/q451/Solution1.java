package HashTable.medium.q451;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class Solution1 {
    public String frequencySort(String s) {
        int[] chars = new int[128];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }
        int max = -1;
        for (int a : chars) {
            max = Math.max(max, a);
        }
        StringBuilder sb = new StringBuilder();
        while (max > 0) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == max) {
                    sb.append(String.valueOf((char) (i)).repeat(max));
                }
            }
            max--;
        }
        return sb.toString();
    }
}
