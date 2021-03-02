package String.easy.q521;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/longest-uncommon-subsequence-i/
 */
public class Solution2 {
    public int findLUSlength(String a, String b) {
        if (a.contains(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}
