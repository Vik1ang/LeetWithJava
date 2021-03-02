package Tree.easy.q563;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-tilt/
 */
public class Solution1 {
    int sum;
    public int findTilt(TreeNode root) {
        sum = 0;
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}
