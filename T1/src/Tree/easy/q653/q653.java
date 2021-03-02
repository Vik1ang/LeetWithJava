package Tree.easy.q653;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class q653 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(5, 3, 6, 2, 4, null, 7);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().findTarget(treeRoot, 9));
    }
}
