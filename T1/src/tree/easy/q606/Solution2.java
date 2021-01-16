package tree.easy.q606;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class Solution2 {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(t);
        HashSet<TreeNode> visited = new HashSet<>();
        StringBuilder str = new StringBuilder();

        while (!stack.isEmpty()) {
            TreeNode peekNode = stack.peek();
            if (visited.contains(peekNode)) {
                stack.pop();
                str.append(")");
            } else {
                visited.add(peekNode);
                str.append("(" + peekNode.val);
                if (peekNode.left == null && peekNode.right != null) {
                    str.append("()");
                }
                if (peekNode.right != null) {
                    stack.push(peekNode.right);
                }
                if (peekNode.left != null) {
                    stack.push(peekNode.left);
                }
            }
        }
        return str.substring(1, str.length() - 1);
    }
}
