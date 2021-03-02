package Tree.easy.q671;

import Tree.util.TreeNode;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class Solution2 {
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> uniques = new HashSet<>();
        dfs(root, uniques);

        int min1 = root.val;
        long min = Long.MAX_VALUE;
        for (int v : uniques) {
            if (min1 < v && v < min) {
                min = v;
            }
        }
        return min < Long.MAX_VALUE ? (int)min : -1;
    }

    private void dfs(TreeNode root, HashSet<Integer> uniques) {
        if (root == null) {
            return;
        }
        uniques.add(root.val);
        dfs(root.left, uniques);
        dfs(root.right, uniques);
    }

}
