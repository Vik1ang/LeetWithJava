package tree.easy.q404;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-left-leaves/
 */
public class Solution1 {
    int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}
