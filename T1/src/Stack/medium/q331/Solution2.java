package Stack.medium.q331;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
 */
public class Solution2 {
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        int slots = 1;
        while (i < n) {
            if (slots == 0) {
                return false;
            }
            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                slots--;
                i++;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                slots++;
            }

        }
        return slots == 0;
    }
}
