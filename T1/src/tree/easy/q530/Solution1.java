package tree.easy.q530;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution1 {
    int min;
    int pre;
    public int getMinimumDifference(TreeNode root) {
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
        if (pre == -1) {
            pre = node.val;
        } else {
            min = Math.min(min, node.val - pre);
            pre = node.val;
        }
        inorder(node.right);
    }
}
