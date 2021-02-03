package string.easy.q1408;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/string-matching-in-an-array/
 */
public class Solution1 {
    public List<String> stringMatching(String[] words) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    hashSet.add(words[i]);
                    break;
                }
            }
        }
        return new ArrayList<String>(hashSet);
    }
}
