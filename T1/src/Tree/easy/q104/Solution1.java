package Tree.easy.q104;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = Math.max(maxDepth(root.left), maxDepth(root.right));

        return max + 1;
    }
}
