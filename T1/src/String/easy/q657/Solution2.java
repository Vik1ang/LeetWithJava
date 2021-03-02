package String.easy.q657;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/robot-return-to-origin/
 */
public class Solution2 {
    public boolean judgeCircle(String moves) {
        int[] alphabet = new int[26];
        for (char c : moves.toCharArray()) {
            alphabet[c - 'A']++;
        }
        return alphabet['L' - 'A'] == alphabet['R' - 'A'] && alphabet['U' - 'A'] == alphabet['D' - 'A'];
    }
}
