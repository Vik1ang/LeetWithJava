package Tree.easy.q102;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> arrayList = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                arrayList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            res.add(arrayList);
        }
        return res;
    }
}
