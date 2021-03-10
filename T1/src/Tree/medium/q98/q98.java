package Tree.medium.q98;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/validate-binary-search-tree/
 */
public class q98 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeNode = new TreeNode();
        List<Integer> tree = Arrays.asList(4, 3, 5, 1, 2, null, 6);
        treeHelper.createTree(treeNode, tree);
        new Solution1().isValidBST(treeNode);
    }
}
