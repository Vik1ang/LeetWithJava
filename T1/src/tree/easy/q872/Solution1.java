package tree.easy.q872;

import tree.util.TreeNode;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution1 {
    ArrayList<Integer> arrayList1;
    ArrayList<Integer> arrayList2;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        arrayList1 = new ArrayList<>();
        arrayList2 = new ArrayList<>();

        dfs(arrayList1, root1);
        dfs(arrayList2, root2);

        // if (arrayList1.size() != arrayList2.size()) {
        //     return false;
        // }
        //
        // for (int i = 0; i < arrayList1.size(); i++) {
        //     if (arrayList1.get(i) != arrayList2.get(i)) {
        //         return false;
        //     }
        // }
        // return true;
        return arrayList1.equals(arrayList2);
    }

    private void dfs(ArrayList<Integer> arrayList, TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            arrayList.add(node.val);
        }
        dfs(arrayList, node.left);
        dfs(arrayList, node.right);
    }
}
