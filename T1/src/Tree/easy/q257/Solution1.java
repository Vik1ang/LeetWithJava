package Tree.easy.q257;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-paths/
 */
public class Solution1 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> strings = new ArrayList<>();
        preorder(root, "", strings);
        return strings;
    }

    private void preorder(TreeNode node, String path, ArrayList<String> paths) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        }
        path = path + node.val + "->";
        preorder(node.left, path, paths);
        preorder(node.right, path, paths);
    }
}
