package Tree.easy.q563;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

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
