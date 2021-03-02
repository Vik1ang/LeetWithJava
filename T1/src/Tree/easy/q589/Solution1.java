package Tree.easy.q589;

import Tree.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution1 {
    ArrayList<Integer> res;

    public List<Integer> preorder(Node root) {
        res = new ArrayList<>();
        inorder(root);
        return res;
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        if (root.children != null) {
            int size = root.children.size();
            for (int i = 0; i < size; i++) {
                inorder(root.children.get(i));
            }
        }
    }
}
