package Tree.easy.q669;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/trim-a-binary-search-tree/
 */
public class q669 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(3, 0, 4, null, 2, null, null, 1);
        treeHelper.createTree(treeRoot, input);

        treeHelper.printTree(new Solution1().trimBST(treeRoot, 1, 3));
    }
}
