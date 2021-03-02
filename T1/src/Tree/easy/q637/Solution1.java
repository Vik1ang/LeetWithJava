package Tree.easy.q637;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class Solution1 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Double> sum = new ArrayList<>();
        dfs(root, 0, count, sum);
        ArrayList<Double> ave = new ArrayList<>();
        for (int i = 0; i < sum.size(); i++) {
            ave.add(sum.get(i) / count.get(i));
        }
        return ave;
    }

    private void dfs(TreeNode root, int level, ArrayList<Integer> count, ArrayList<Double> sum) {
        if (root == null) {
            return;
        }
        if (level < sum.size()) {
            sum.set(level, sum.get(level) + root.val);
            count.set(level, count.get(level) + 1);
        } else {
            sum.add((double) root.val);
            count.add(1);
        }
        dfs(root.left, level + 1, count, sum);
        dfs(root.right, level + 1, count, sum);
    }
}
