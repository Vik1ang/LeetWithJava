package tree.easy.q783;

import tree.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class Solution3 {
    ArrayList<Integer> arrayList;
    public int minDiffInBST(TreeNode root) {
        arrayList = new ArrayList<>();
        dfs(root);
        Collections.sort(arrayList);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size()-1; i++) {
            min = Math.min(arrayList.get(i + 1) - arrayList.get(i), min);
        }
        return min;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        arrayList.add(root.val);
    }
}
