package tree.easy.q226;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/invert-binary-tree/
 */
public class q226 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(4,2,7,1,3,6,9);
        treeHelper.createTree(treeRoot, input);

        treeHelper.printTree(new Solution1().invertTree(treeRoot));

    }
}
