package tree.easy.q617;

/**
 * @author Channing
 * @URL https://leetcode.com/problems/merge-two-binary-trees/
 */
public class q617 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root1LeftChild1 = new TreeNode(3);
        root1.left = root1LeftChild1;
        root1.right = new TreeNode(2);
        root1LeftChild1.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        TreeNode root2LeftChild1 = new TreeNode(1);
        TreeNode root2RightChild1 = new TreeNode(3);
        root2.left = root2LeftChild1;
        root2.right = root2RightChild1;
        root2LeftChild1.right = new TreeNode(4);
        root2RightChild1.right = new TreeNode(7);

        // make your own solution
        TreeNode newTree = new Solution().mergeTrees(root1, root2);

        preorder(newTree);

    }

    public static void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
}
