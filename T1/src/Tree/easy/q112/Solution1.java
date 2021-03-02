package Tree.easy.q112;

import Tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/path-sum/
 */
public class Solution1 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}
