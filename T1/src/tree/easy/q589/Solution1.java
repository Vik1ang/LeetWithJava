package tree.easy.q589;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL
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
        int size = root.children.size();

        for (int i = 0; i < size; i++) {
            inorder(root.children.get(i));
        }

    }
}