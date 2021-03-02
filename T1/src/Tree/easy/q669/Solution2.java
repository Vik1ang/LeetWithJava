package Tree.easy.q669;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL  https://leetcode.com/problems/trim-a-binary-search-tree/
 */
public class Solution2 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        // find the root of the tree
        while (root.val > high || root.val < low) {
            root = root.val > high ? root.left : root.right;
        }

        TreeNode node = root;
        while (node != null) {
            while (node.left != null && node.left.val < low) {
                node.left = node.left.right;
            }
            node = node.left;
        }

        node = root;
        while (node != null) {
            while (node.right != null && node.right.val > high) {
                node.right = node.right.left;
            }
            node = node.right;
        }
        return root;

    }
}
