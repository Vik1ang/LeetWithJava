package tree.medium.q1302;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/deepest-leaves-sum/
 */
public class Solution2 {
    int max;
    int total;

    public int deepestLeavesSum(TreeNode root) {
        max = -1;
        total = 0;
        dfs(root, 0);
        return total;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (depth > max) {
            max = depth;
            total = node.val;
        } else if (depth == max) {
            total += node.val;
        }
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }


}
