package tree.easy.q530;

import tree.util.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution2 {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        arrayList.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;
        for (int i = arrayList.size() - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if ((arrayList.get(i) - arrayList.get(j)) < min) {
                    min = arrayList.get(i) - arrayList.get(j);
                }
            }

        }
        return min;
    }

    private void dfs(TreeNode node, ArrayList<Integer> arrayList) {
        if (node == null) {
            return;
        }
        dfs(node.left, arrayList);
        dfs(node.right, arrayList);
        arrayList.add(node.val);
    }
}
