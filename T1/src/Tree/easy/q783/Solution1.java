package Tree.easy.q783;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class Solution1 {
    int min;
    int pre;

    public int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        inorder(root);
        return min;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        if (pre != -1) {
            min = Math.min(min, node.val - pre);
        }
        pre = node.val;
        inorder(node.right);
    }
}
