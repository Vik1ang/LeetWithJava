package tree.easy.q563;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-tilt/
 */
public class q563 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList();
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution2().findTilt(treeRoot));
    }
}
