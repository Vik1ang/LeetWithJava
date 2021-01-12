package tree.easy.q559;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution1 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            int temp = maxDepth(node);
            max = Math.max(max, temp);
        }
        return max + 1;
    }
}
