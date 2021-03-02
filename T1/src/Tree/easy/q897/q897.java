package Tree.easy.q897;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/increasing-order-search-tree/
 */
public class q897 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9);
        treeHelper.createTree(treeRoot, input);

        treeHelper.printTree(new Solution1().increasingBST(treeRoot));
    }
}
