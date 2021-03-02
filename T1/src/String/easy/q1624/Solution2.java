package String.easy.q1624;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 */
public class Solution2 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        int[] ch = new int[26];
        for (int i = 0; i < 26; i++) {
            ans = Math.max(ans, s.lastIndexOf(i + 'a') - s.indexOf(i + 'a') - 1);
        }
        return ans;
    }
}
