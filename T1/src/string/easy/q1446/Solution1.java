package string.easy.q1446;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/consecutive-characters/
 */
public class Solution1 {
    public int maxPower(String s) {
        int maxLen = 1;
        char maxChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            int temp = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    temp++;
                    i++;
                } else {
                    break;
                }
                maxLen = Integer.max(maxLen, temp);
            }
        }
        return maxLen;
    }
}
