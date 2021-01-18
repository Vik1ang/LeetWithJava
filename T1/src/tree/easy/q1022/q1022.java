package tree.easy.q1022;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class q1022 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 0, 1, 0, 1, 0, 1);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().sumRootToLeaf(treeRoot));
    }
}
