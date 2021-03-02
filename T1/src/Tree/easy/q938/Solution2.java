package Tree.easy.q938;


import Tree.util.TreeNode;

import java.util.Stack;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/range-sum-of-bst/
 */
public class Solution2 {

    public int rangeSumBST(TreeNode root, int low, int high) {
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
}
