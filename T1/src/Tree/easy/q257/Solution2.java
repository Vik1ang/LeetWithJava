package Tree.easy.q257;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-paths/
 */
public class Solution2 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        Queue<TreeNode> treeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();

        treeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.val));

        while (!treeQueue.isEmpty()) {
            TreeNode node = treeQueue.poll();
            String path = pathQueue.poll();

            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                if (node.left != null) {
                    treeQueue.offer(node.left);
                    pathQueue.offer(path + "->" + node.left.val);
                }
                if (node.right != null) {
                    treeQueue.offer(node.right);
                    pathQueue.offer(path + "->" + node.right.val);
                }
            }
        }
        return paths;
    }
}
