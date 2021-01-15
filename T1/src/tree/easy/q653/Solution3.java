package tree.easy.q653;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class Solution3 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (hashSet.contains(k - node.val)) {
                return true;
            }
            hashSet.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return false;
    }
}
