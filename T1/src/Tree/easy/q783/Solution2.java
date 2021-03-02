package Tree.easy.q783;

import Tree.util.TreeNode;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class Solution2 {
    public int minDiffInBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        int min = Integer.MAX_VALUE;
        int pre = -1;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                if (pre != -1) {
                    min = Math.min(min, node.val - pre);
                }
                pre = node.val;
                node = node.right;
            }
        }

        return min;
    }
}
