package tree.easy.q938;


import java.util.Stack;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/range-sum-of-bst/
 */
public class Solution {

    int ans;

    public int rangeSumBST(TreeNode root, int low, int high) {
        /*ans = 0;
        dfs(root, low, high);
        return ans;*/
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (low <= node.val && node.val <= high) {
                    res += node.val;
                }
                if (low < node.val) {
                    stack.push(node.left);
                }
                if (node.val < high) {
                    stack.push(node.right);
                }
            }
        }
        return res;
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
