package Tree.medium.q98;

import Tree.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/validate-binary-search-tree/
 */
public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
