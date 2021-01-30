package string.easy.q1684;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 */
public class Solution2 {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = words.length;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                String temp = null;
                if (!allowed.contains(temp.valueOf(c))) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
