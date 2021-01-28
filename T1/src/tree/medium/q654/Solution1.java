package tree.medium.q654;

import tree.util.TreeNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-binary-tree/
 */
public class Solution1 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int findMax = max(nums, l, r);
        TreeNode root = new TreeNode(nums[findMax]);
        root.left = construct(nums, l, findMax);
        root.right = construct(nums, findMax + 1, r);
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int maxIndex = l;
        for (int i = l; i < r; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
