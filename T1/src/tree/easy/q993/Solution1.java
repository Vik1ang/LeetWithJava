package tree.easy.q993;

import tree.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class Solution1 {
    Map<Integer, Integer> depth;
    Map<Integer, TreeNode> parent;

    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();
        dfs(root, null);

        if (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y)) {
            return true;
        }
        return false;
    }

    private void dfs(TreeNode node, TreeNode par) {
        if (node == null) {
            return;
        }
        if (par != null) {
            depth.put(node.val, 1 + depth.get(par.val));
        } else {
            depth.put(node.val, 0);
        }
        parent.put(node.val, par);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}
