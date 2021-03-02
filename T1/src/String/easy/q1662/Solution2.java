package String.easy.q1662;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class Solution2 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).toString().equals(String.join("", word2));
    }
}
