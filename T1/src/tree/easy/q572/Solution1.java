package tree.easy.q572;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/subtree-of-another-tree/
 */
public class Solution1 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    private boolean dfs(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return check(s, t) || dfs(s.left, t) || dfs(s.right, t);
    }

    private boolean check(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return check(s.left, t.left) && check(s.right, t.right);
    }
}
