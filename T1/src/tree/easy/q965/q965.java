package tree.easy.q965;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/univalued-binary-tree/
 */
public class q965 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 1, 1, 1, 1, null, 1);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().isUnivalTree(treeRoot));
    }
}
