package tree.easy.q112;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/path-sum/
 */
public class Solution2 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queueNode = new LinkedList<>();
        Queue<Integer> queueVal = new LinkedList<>();
        queueNode.offer(root);
        queueVal.offer(root.val);

        while (!queueNode.isEmpty()) {
            TreeNode node = queueNode.poll();
            Integer nodeVal = queueVal.poll();
            if (node.left == null && node.right == null) {
                if (nodeVal == targetSum) {
                    return true;
                }
                continue;
            }
            if (node.left != null) {
                queueNode.offer(node.left);
                queueVal.offer(node.left.val + nodeVal);
            }
            if (node.right != null) {
                queueNode.offer(node.right);
                queueVal.offer(node.right.val + nodeVal);
            }

        }
        return false;
    }
}
