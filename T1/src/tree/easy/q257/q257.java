package tree.easy.q257;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-paths/
 */
public class q257 {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(4, 2, 6, null, 3, 1, null);
        TreeHelper treeHelper = new TreeHelper();
        TreeNode root = new TreeNode();
        treeHelper.createTree(root, arrayList);
        // treeHelper.printTree(root);

        System.out.println(new Solution1().binaryTreePaths(root));
    }
}
