package tree.easy.q700;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/search-in-a-binary-search-tree
 */
public class Solution2 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
