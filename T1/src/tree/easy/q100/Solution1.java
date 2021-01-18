package tree.easy.q100;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/same-tree/
 */
public class Solution1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        dfs(p, arrayList1);
        dfs(q, arrayList2);
        return arrayList1.equals(arrayList2);
    }

    private void dfs(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null) {
            arrayList.add(null);
            return;
        }
        dfs(node.left, arrayList);
        dfs(node.right, arrayList);
        arrayList.add(node.val);
    }
}
