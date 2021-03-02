package Tree.easy.q637;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class q637 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(3, 9, 20, 15, 7);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().averageOfLevels(treeRoot));
    }
}
