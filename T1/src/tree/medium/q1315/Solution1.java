package tree.medium.q1315;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 */
public class Solution1 {
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
                if (node.val % 2 == 0) {
                    if (node.left.left != null) {
                        sum += node.left.left.val;
                    }
                    if (node.left.right != null) {
                        sum += node.left.right.val;
                    }
                }
            }
            if (node.right != null) {
                queue.offer(node.right);
                if (node.val % 2 == 0) {
                    if (node.right.left != null) {
                        sum += node.right.left.val;
                    }
                    if (node.right.right != null) {
                        sum += node.right.right.val;
                    }
                }
            }
        }
        return sum;
    }
}
