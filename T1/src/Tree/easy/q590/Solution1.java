package Tree.easy.q590;

import Tree.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class Solution1 {
    ArrayList<Integer> res;
    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();
        helperFunc(root);
        return res;
    }

    private void helperFunc(Node node) {
        if (node == null) {
            return;
        }
        if (node.children != null) {
            for (Node n : node.children) {
                helperFunc(n);
            }
        }
        res.add(node.val);
    }

}
