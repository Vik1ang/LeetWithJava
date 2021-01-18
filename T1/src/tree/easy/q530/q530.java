package tree.easy.q530;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class q530 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rootRight = new TreeNode(3);
        TreeNode level2left = new TreeNode(2);
        root.right = rootRight;
        rootRight.left = level2left;
        int minimumDifference = new Solution1().getMinimumDifference(root);
        System.out.println(minimumDifference);
    }
}
