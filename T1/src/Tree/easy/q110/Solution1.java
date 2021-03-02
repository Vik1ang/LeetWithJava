package Tree.easy.q110;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/balanced-binary-tree/
 */
public class Solution1 {
    Boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        depth(root);
        return flag;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);

        if (Math.abs(left - right) > 1 && flag) {
            flag = false;
        }

        return left > right ? left + 1 : right + 1;
    }
}
