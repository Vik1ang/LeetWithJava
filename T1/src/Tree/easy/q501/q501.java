package Tree.easy.q501;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class q501 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(3, 20, 20, null, null, 15, 15);
        treeHelper.createTree(treeRoot, input);

        System.out.println(Arrays.toString(new Solution1().findMode(treeRoot)));
    }
}
