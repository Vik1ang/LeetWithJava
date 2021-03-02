package Tree.easy.q606;

import Tree.util.TreeHelper;
import Tree.util.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class q606 {
    public static void main(String[] args) {
        TreeHelper treeHelper = new TreeHelper();
        TreeNode treeRoot = new TreeNode();
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        treeHelper.createTree(treeRoot, input);

        System.out.println(new Solution1().tree2str(treeRoot));
    }
}
