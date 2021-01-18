package tree.easy.q100;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/same-tree/
 */
public class q100 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode root1 = new TreeNode();
        List<Integer> tree1 = Arrays.asList(1, 2, 3);
        treeHelper.createTree(root1, tree1);
        TreeNode root2 = new TreeNode();
        List<Integer> tree2 = Arrays.asList(1, 2, 3);
        treeHelper.createTree(root2, tree2);

        System.out.println(new Solution2().isSameTree(root1, root2));
    }
}
