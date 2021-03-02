package Tree.easy.q101;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/symmetric-tree/
 */
public class q101 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 2, 2, 2, null, 2);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution2().isSymmetric(treeRoot));
    }
}