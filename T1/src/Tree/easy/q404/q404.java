package Tree.easy.q404;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-left-leaves/
 */
public class q404 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(3, 9, 20, null, null, 15, 7);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution2().sumOfLeftLeaves(treeRoot));
    }
}
