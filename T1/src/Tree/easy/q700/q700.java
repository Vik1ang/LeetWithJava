package Tree.easy.q700;


import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/search-in-a-binary-search-tree
 */
public class q700 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(4, 2, 7, 1, 3);
        treeHelper.createTree(treeRoot, input);

        treeHelper.printTree(new Solution1().searchBST(treeRoot, 2));

    }
}
