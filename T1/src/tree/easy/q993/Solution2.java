package tree.easy.q993;

import tree.util.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class Solution2 {
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer, Integer> depth = new HashMap<>();
        HashMap<Integer, TreeNode> parent = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (depth.isEmpty()) {
                depth.put(node.val, 0);
                parent.put(node.val, null);
            } else {
                TreeNode parentNode = parent.get(node.val);
                depth.put(node.val, depth.get(parentNode.val) + 1);
            }
            if (node.left != null) {
                queue.offer(node.left);
                parent.put(node.left.val, node);
            }
            if (node.right != null) {
                queue.offer(node.right);
                parent.put(node.right.val, node);
            }

        }
        if (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y)) {
            return true;
        }
        return false;
    }
}
