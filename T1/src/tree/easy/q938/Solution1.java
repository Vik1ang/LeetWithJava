package tree.easy.q938;


import tree.util.TreeNode;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/range-sum-of-bst/
 */
public class Solution1 {

    int ans;

    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;

    }

    // recursion version
    private void dfs(TreeNode node, int low, int high) {
        if (node != null) {
            if (low <= node.val && node.val <= high) {
                ans += node.val;
            }
            if (low < node.val) {
                dfs(node.left, low, high);
            }
            if (node.val < high) {
                dfs(node.right, low, high);
            }
        }
    }
}
