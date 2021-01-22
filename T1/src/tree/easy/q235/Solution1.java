package tree.easy.q235;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0) {
            return root;
        }
        return lowestCommonAncestor(p.val < root.val ? root.left : root.right, p, q);
    }
}
