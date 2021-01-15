package tree.easy.q653;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class Solution2 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        return find(root, k, hashSet);
    }

    private boolean find(TreeNode root, int k, HashSet<Integer> hashSet) {
        if (root == null) {
            return false;
        }
        if (hashSet.contains(k - root.val)) {
            return true;
        }
        hashSet.add(root.val);
        return find(root.left, k, hashSet) || find(root.right, k, hashSet);
    }
}
