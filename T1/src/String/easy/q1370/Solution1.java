package String.easy.q1370;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/increasing-decreasing-string/
 */
public class Solution1 {
    public String sortString(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer stringBuffer = new StringBuffer();
        while (stringBuffer.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (num[i] > 0) {
                    stringBuffer.append((char) (i + 'a'));
                    num[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (num[i] > 0) {
                    stringBuffer.append((char) (i + 'a'));
                    num[i]--;
                }
            }
        }
        return stringBuffer.toString();
    }
}
