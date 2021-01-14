package tree.easy.q108;

import java.util.Random;

/**
 * @author Vikiang
 * @URL
 */
public class Solution3 {
    Random rand = new Random();

    public TreeNode sortedArrayToBST(int[] nums) {
        return inorder(nums, 0, nums.length - 1);
    }

    private TreeNode inorder(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right + rand.nextInt(2)) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = inorder(nums, left, mid - 1);
        node.right = inorder(nums, mid + 1, right);
        return node;
    }
}
