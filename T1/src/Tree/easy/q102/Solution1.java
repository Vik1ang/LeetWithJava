package Tree.easy.q102;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<>();
        dfs(1, root, res);
        return null;
    }

    private void dfs(int index, TreeNode node, List<List<Integer>> res) {
        if (res.size() < index) {
            res.add(new ArrayList<Integer>());
        }
        res.get(index - 1).add(node.val);
        if (node.left != null) {
            dfs(index + 1, node.left, res);
        }
        if (node.right != null) {
            dfs(index + 1, node.right, res);
        }
    }
}
