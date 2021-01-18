package tree.easy.q700;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/search-in-a-binary-search-tree
 */
public class Solution1 {
    boolean flag;
    TreeNode cur;

    public TreeNode searchBST(TreeNode root, int val) {
        flag = false;
        cur = new TreeNode(0);
        GetNode(root, val);

        return cur.right;
    }

    private void GetNode(TreeNode node, int val) {
        if (node == null) {
            return;
        }
        if (node.val == val && !flag) {
            flag = true;
            cur.right = node;
            return;
        }
        GetNode(node.left, val);
        GetNode(node.right, val);
    }


}
