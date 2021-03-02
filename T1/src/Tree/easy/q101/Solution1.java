package Tree.easy.q101;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/symmetric-tree/
 */
public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root, root);
    }

    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
