package Tree.easy.q110;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/balanced-binary-tree/
 */
public class q110 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().isBalanced(treeRoot));
    }
}
