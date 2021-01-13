package tree.easy.q872;

import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution2 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        LinkedList<TreeNode> stack1 = new LinkedList<>();
        LinkedList<TreeNode> stack2 = new LinkedList<>();

        stack1.addFirst(root1);
        stack2.addFirst(root2);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node1 = stack1.pollFirst();

        }
        return false;
    }
}
