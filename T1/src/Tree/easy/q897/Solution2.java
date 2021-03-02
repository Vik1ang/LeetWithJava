package Tree.easy.q897;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/increasing-order-search-tree/
 */
public class Solution2 {
    TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {
        // inorder and change tree connection
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder2(root);
        return ans.right;

    }

    private void inorder2(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder2(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder2(node.right);
    }

}
