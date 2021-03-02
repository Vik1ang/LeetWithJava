package Tree.easy.q563;

import Tree.util.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-tilt/
 */
public class Solution2 {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<TreeNode> treeNodeLinkedList = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            treeNodeLinkedList.addFirst(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        for (TreeNode node : treeNodeLinkedList) {
            int left = 0;
            int right = 0;
            if (node.left != null) {
                left = node.left.val;
            }
            if (node.right != null) {
                right = node.right.val;
            }
            sum += Math.abs(left - right);
            node.val = left + right + node.val;
        }

        return sum;
    }
}
