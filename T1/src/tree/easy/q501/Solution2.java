package tree.easy.q501;

import tree.util.TreeNode;

import java.util.ArrayList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class Solution2 {
    ArrayList<Integer> answer;
    int base, count, maxCount;

    public int[] findMode(TreeNode root) {
        answer = new ArrayList<>();
        dfs(root);
        // int[] mode = new int[answer.size()];
        // for (int i = 0; i < answer.size(); i++) {
        //     mode[i] = answer.get(i);
        // }
        // return mode;
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    private void update(int val) {
        if (val == base) {
            ++count;
        } else {
            count = 1;
            base = val;
        }
        if (count == maxCount) {
            answer.add(base);
        }
        if (count > maxCount) {
            maxCount = count;
            answer.clear();
            answer.add(base);
        }
    }

}
