package tree.easy.q897;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/increasing-order-search-tree/
 */
public class Solution1 {
    TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {
        // inorder and return a new tree
        ArrayList<Integer> treeNodes = new ArrayList<>();
        inorder(root, treeNodes);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for (int v : treeNodes) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }

        return ans.right;


    }

    private void inorder(TreeNode node, ArrayList<Integer> treeNodes) {
        if (node == null) {
            return;
        }
        inorder(node.left, treeNodes);
        treeNodes.add(node.val);
        inorder(node.right, treeNodes);
    }
}
