package tree.easy.q543;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class Solution1 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        dfs(root);
        return ans - 1 ;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
