package Tree.easy.q530;

import Tree.util.TreeNode;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution3 {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int pre = -1;
        int min = Integer.MAX_VALUE;
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
