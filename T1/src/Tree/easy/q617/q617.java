package Tree.easy.q617;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/merge-two-binary-trees/
 */
public class q617 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot1 = new TreeNode();
        List<Integer> input1 = Arrays.asList(1, 3, 2, 5);
        treeHelper.createTree(treeRoot1, input1);
        TreeNode treeRoot2 = new TreeNode();
        List<Integer> input2 = Arrays.asList(2, 1, 3, null, 4, null, 7);
        treeHelper.createTree(treeRoot2, input2);

        treeHelper.printTree(new Solution1().mergeTrees(treeRoot1, treeRoot2));
    }

}
