package tree.medium.q1379;

import tree.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class Solution2 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<TreeNode> clonedStack = new LinkedList<>();
        TreeNode node = original;
        TreeNode cloneTarget = cloned;

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                if (node == target) {
                    return cloneTarget;
                }

                stack.push(node);
                node = node.left;
                clonedStack.push(cloneTarget);
                cloneTarget = cloneTarget.left;
            } else {
                node = stack.poll();
                node = node.right;
                cloneTarget = clonedStack.pop();
                cloneTarget = cloneTarget.right;
            }
        }
        return null;
    }
}
