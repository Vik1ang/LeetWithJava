package String.easy.q1189;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-number-of-balloons/
 */
public class Solution2 {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for (char c : text.toCharArray()) {
            letters[c - 'a']++;
        }
        letters['l' - 'a'] /= 2;
        letters['o' - 'a'] /= 2;

        int min = Integer.MAX_VALUE;
        for (char c : "balon".toCharArray()) {
            // this is faster
            // if (letters[c - 'a'] < min) {
            //     min = letters[c - 'a'];
            // }
            min = Math.min(min, letters[c - 'a']);
        }
        return min;
    }

}
