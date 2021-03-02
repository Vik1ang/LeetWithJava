package Tree.medium.q1315;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 */
public class Solution2 {
    int sum;

    public int sumEvenGrandparent(TreeNode root) {
        sum = 0;
        dfs(root, 1, 1);
        return sum;
    }

    private void dfs(TreeNode node, int gp_val, int p_val) {
        if (node == null) {
            return;
        }
        if (gp_val % 2 == 0) {
            sum += node.val;
        }
        dfs(node.left, p_val, node.val);
        dfs(node.right, p_val, node.val);
    }
}
