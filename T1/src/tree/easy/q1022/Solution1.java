package tree.easy.q1022;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class Solution1 {
    public int sumRootToLeaf(TreeNode root) {
        return helperFunc(root, 0);
    }

    private int helperFunc(TreeNode node, int temp) {
        if (node == null) {
            return 0;
        }

        temp = temp * 2 + node.val;
        if (node.left == null && node.right == null) {
            return temp;
        }

        return helperFunc(node.left, temp) + helperFunc(node.right, temp);
    }
}
