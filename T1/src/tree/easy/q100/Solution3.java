package tree.easy.q100;

import tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/same-tree/
 */
public class Solution3 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();
        queueP.offer(p);
        queueQ.offer(q);

        while (!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode nodeP = queueP.poll();
            TreeNode nodeQ = queueQ.poll();
            if (nodeP.val != nodeQ.val) {
                return false;
            }
            TreeNode leftP = nodeP.left;
            TreeNode leftQ = nodeQ.left;
            TreeNode rightP = nodeP.right;
            TreeNode rightQ = nodeQ.right;
            if (leftP == null ^ leftQ == null) {
                return false;
            }
            if (rightP == null ^ rightQ == null) {
                return false;
            }
            if (leftP != null) {
                queueP.offer(leftP);
            }
            if (leftQ != null) {
                queueQ.offer(leftQ);
            }
            if (rightP != null) {
                queueP.offer(rightP);
            }
            if (rightQ != null) {
                queueQ.offer(rightQ);
            }
        }
        return queueP.isEmpty() && queueQ.isEmpty();
    }
}
