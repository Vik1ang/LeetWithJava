package Tree.easy.q108;

import Tree.util.TreeNode;

import java.util.Stack;

/**
 * @author Vikiang
 * @URL
 */
public class Solution4 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> IndexStack = new Stack<>();
        IndexStack.push(0);
        IndexStack.push(nums.length - 1);

        while (!stack.isEmpty()) {
            int right = IndexStack.pop();
            int left = IndexStack.pop();
            int mid = (right + left) / 2;

            TreeNode node = stack.pop();
            node.val = nums[mid];

            if (left < mid) {
                node.left = new TreeNode();
                stack.push(node.left);
                IndexStack.push(left);
                IndexStack.push(mid - 1);
            }
            if (right > mid) {
                node.right = new TreeNode();
                stack.push(node.right);
                IndexStack.push(mid + 1);
                IndexStack.push(right);
            }
        }

        return root;
    }
}
