package String.easy.q1684;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 */
public class Solution4 {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        int[] allow = new int[26];
        char[] chars = allowed.toCharArray();
        for (char aChar : chars) {
            allow[aChar - 'a'] = 1;
        }
        for (String word : words) {
            char[] arr = word.toCharArray();
            int index = 0;
            int length = arr.length;
            while (index < length) {
                if (allow[arr[index] - 'a'] == 0) {
                    break;
                }
                index++;
            }
            if (index == length) {
                result++;
            }
        }
        return result;
    }
}
