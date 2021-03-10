package Tree.medium.q98;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/validate-binary-search-tree/
 */
public class Solution2 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        double val = -Double.MAX_VALUE;
        for (Integer i : arrayList) {
            if (val >= i) {
                return false;
            }
            val = i;
        }
        return true;
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
}
