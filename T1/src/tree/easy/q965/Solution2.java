package tree.easy.q965;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/univalued-binary-tree/
 */
public class Solution2 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int value = root.val;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val != value) {
                return false;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return true;
    }
}
