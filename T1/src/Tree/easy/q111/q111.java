package Tree.easy.q111;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class q111 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(2, null, 3, null, 4, null, 5, null, 6);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().minDepth(treeRoot));
    }
}
