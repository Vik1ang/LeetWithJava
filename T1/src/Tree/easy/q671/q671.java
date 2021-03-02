package Tree.easy.q671;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class q671 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(2, 2, 2147483647);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution2().findSecondMinimumValue(treeRoot));
    }
}
