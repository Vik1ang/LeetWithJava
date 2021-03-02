package String.easy.q1704;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class Solution1 {
    public boolean halvesAreAlike(String s) {
        String s1 = s.toLowerCase().substring(0, s.length() / 2);
        String s2 = s.toLowerCase().substring(s.length() / 2);
        HashSet<Character> hashSet = new HashSet<>();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (char c : vowel) {
            hashSet.add(c);
        }
        int countS1 = 0;
        int countS2 = 0;
        for (char c : s1.toCharArray()) {
            if (hashSet.contains(c)) {
                countS1++;
            }
        }
        for (char c : s2.toCharArray()) {
            if (hashSet.contains(c)) {
                countS2++;
            }
        }
        return countS1 == countS2;
    }
}
