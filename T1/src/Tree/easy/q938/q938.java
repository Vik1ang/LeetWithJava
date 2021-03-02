package Tree.easy.q938;


import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/range-sum-of-bst/
 */
public class q938 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(10, 5, 15, 3, 7, null, 18);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().rangeSumBST(treeRoot, 7, 15));
    }
}
