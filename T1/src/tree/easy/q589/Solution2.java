package tree.easy.q589;

import tree.util.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution2 {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            if (node.children != null) {
                Collections.reverse(node.children);
                stack.addAll(node.children);
            }
        }
        return output;
    }
}
