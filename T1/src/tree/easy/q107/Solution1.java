package tree.easy.q107;

import tree.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class Solution1 {
    ArrayList<List<Integer>> lists;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        dfs(root, 0);
        Collections.reverse(lists);
        return lists;
    }

    private void dfs(TreeNode node, int level) {
        if (lists.size() == level) {
            lists.add(new ArrayList<Integer>());
        }
        if (node.left != null) {
            dfs(node.left, level + 1);
        }
        if (node.right != null) {
            dfs(node.right, level + 1);
        }
        lists.get(level).add(node.val);
    }
}
