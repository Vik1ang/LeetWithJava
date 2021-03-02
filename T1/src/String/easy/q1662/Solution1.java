package String.easy.q1662;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class Solution1 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for (String s : word1) {
            w1 += s;
        }
        for (String s : word2) {
            w2 += s;
        }
        return w1.equals(w2);

    }
}
