package tree.easy.q108;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return inorder(nums, 0, nums.length - 1);
    }

    private TreeNode inorder(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = inorder(nums, left, mid - 1);
        node.right = inorder(nums, mid + 1, right);
        return node;
    }
}
