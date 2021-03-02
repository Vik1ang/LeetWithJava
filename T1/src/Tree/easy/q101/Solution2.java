package Tree.easy.q101;

import Tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/symmetric-tree/
 */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode nodeP = queue.poll();
            TreeNode nodeQ = queue.poll();
            if (nodeP == null && nodeQ == null) {
                continue;
            }
            if ((nodeP == null || nodeQ == null) || (nodeP.val != nodeQ.val)) {
                return false;
            }

            queue.offer(nodeP.left);
            queue.offer(nodeQ.right);

            queue.offer(nodeP.right);
            queue.offer(nodeQ.left);

        }
        return true;
    }
}
