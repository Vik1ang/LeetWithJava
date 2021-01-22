package tree.easy.q235;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class q235 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        treeHelper.createTree(treeRoot, input);

        TreeNode p = treeHelper.getTreeNode(treeRoot, 2);
        TreeNode q = treeHelper.getTreeNode(treeRoot, 7);
        System.out.println(new Solution3().lowestCommonAncestor(treeRoot, p, q));
    }
}
