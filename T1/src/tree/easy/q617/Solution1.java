package tree.easy.q617;


/**
 * @author Channing
 * @URL https://leetcode.com/problems/merge-two-binary-trees/
 */
public class Solution1 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
         // dfs
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }
}
