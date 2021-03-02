package Tree.medium.q1379;

import Tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class Solution3 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> clonedQueue = new LinkedList<>();
        queue.offer(original);
        clonedQueue.offer(cloned);
        TreeNode node1;
        TreeNode node2;

        while (!queue.isEmpty()) {
            node1 = queue.poll();
            node2 = clonedQueue.poll();

            if (target == node1) {
                return node2;
            }
            if (node1.left != null) {
                queue.offer(node1.left);
                clonedQueue.offer(node2.left);
            }
            if (node1.right != null) {
                queue.offer(node1.right);
                clonedQueue.offer(node2.right);
            }
        }
        return null;
    }
}
