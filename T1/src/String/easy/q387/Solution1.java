package String.easy.q387;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class Solution1 {
    public int firstUniqChar(String s) {
        int index = 0;
        boolean flag = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                flag = true;
                index = i;
                break;
            }
        }
        if (!flag) {
            return -1;
        } else {
            return index;
        }
    }
}
