package String.easy.q1684;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 */
public class Solution3 {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = solve(allowed);
        int total = 0;
        for (String word : words) {
            int res = solve(word);
            if ((res & ans) == res) {
                total++;
            }
        }
        return total;
    }

    private int solve(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            ans |= (1 << x);
        }
        return ans;
    }
}
