package string.easy.q1624;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 */
public class Solution1 {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            hashSet.add(c);
        }
        int max = -1;
        char[] chars = hashSet.toString().toCharArray();
        for (char c : chars) {
            max = Math.max(max, s.lastIndexOf(c) - s.indexOf(c) - 1);
        }
        return max;
    }
}
