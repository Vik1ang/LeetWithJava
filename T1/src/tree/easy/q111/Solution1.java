package tree.easy.q111;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class Solution1 {
    static class QueueNode {
        TreeNode node;
        int depth;

        public QueueNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<QueueNode> queue = new LinkedList<>();
        queue.offer(new QueueNode(root, 1));

        while (!queue.isEmpty()) {
            QueueNode node = queue.poll();
            TreeNode treeNode = node.node;
            int depth = node.depth;
            if (treeNode.left == null && treeNode.right == null) {
                return depth;
            }
            if (treeNode.left != null) {
                queue.offer(new QueueNode(treeNode.left, depth + 1));
            }
            if (treeNode.right != null) {
                queue.offer(new QueueNode(treeNode.right, depth + 1));
            }
        }
        return 0;
    }
}
