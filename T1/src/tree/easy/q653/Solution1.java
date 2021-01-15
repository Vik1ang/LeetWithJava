package tree.easy.q653;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class Solution1 {
    ArrayList<Integer> arrayList;
    public boolean findTarget(TreeNode root, int k) {
        arrayList = new ArrayList<>();
        dfs(root);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) + arrayList.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        arrayList.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
