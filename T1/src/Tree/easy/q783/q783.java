package Tree.easy.q783;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class q783 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(4, 2, 6, 1, 3, null, null);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().minDiffInBST(treeRoot));
    }
}
