package string.easy.q1704;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class Solution2 {
    public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = s.length() - 1;
        int count = 0;
        int[] arr = new int[128];
        arr['a'] = 1;
        arr['e'] = 1;
        arr['i'] = 1;
        arr['o'] = 1;
        arr['u'] = 1;
        arr['A'] = 1;
        arr['E'] = 1;
        arr['I'] = 1;
        arr['O'] = 1;
        arr['U'] = 1;
        while (left < right) {
            count += arr[s.charAt(left++)];
            count -= arr[s.charAt(right--)];
        }
        return count == 0;
    }
}
