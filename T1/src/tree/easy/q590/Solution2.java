package tree.easy.q590;

import tree.util.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class Solution2 {
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            if (node.children != null) {
                stack.addAll(node.children);
            }
        }
        return output;
    }
}
