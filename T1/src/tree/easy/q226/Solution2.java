package tree.easy.q226;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/invert-binary-tree/
 */
public class Solution2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            node.left = right;
            node.right = left;

            if (left != null) {
                queue.offer(left);
            }
            if (right != null) {
                queue.offer(right);
            }

        }
        return root;
    }
}
