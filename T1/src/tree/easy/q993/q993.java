package tree.easy.q993;

import tree.util.TreeHelper;
import tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class q993 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 2, 3, null, 4, null, 5);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution2().isCousins(treeRoot, 5, 4));
    }
}
