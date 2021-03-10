package Tree.medium.q98;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/validate-binary-search-tree/
 */
public class Solution3 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long lower, long upper) {
        if (root == null) {
            return true;
        }
        if (root.val <= lower || root.val >= upper) {
            return false;
        }
        return helper(root.left, lower, root.val) && helper(root.right, root.val, upper);
    }
}
