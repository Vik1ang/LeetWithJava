package Tree.easy.q872;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/leaf-similar-trees/
 */
public class q872 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot1 = new TreeNode();
        List<Integer> input1 = Arrays.asList(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        treeHelper.createTree(treeRoot1, input1);
        TreeNode treeRoot2 = new TreeNode();
        List<Integer> input2 = Arrays.asList(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        treeHelper.createTree(treeRoot2, input2);

        System.out.println(new Solution1().leafSimilar(treeRoot1, treeRoot2));
    }
}
