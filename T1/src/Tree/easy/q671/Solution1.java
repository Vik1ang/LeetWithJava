package Tree.easy.q671;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class Solution1 {
    ArrayList<Integer> arrayList;

    public int findSecondMinimumValue(TreeNode root) {
        arrayList = new ArrayList<>();
        dfs(root);
        arrayList.sort(Comparator.naturalOrder());
        int second = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (integer > second) {
                second = integer;
                break;
            }
        }
        return second == arrayList.get(0) ? -1 : second;
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
