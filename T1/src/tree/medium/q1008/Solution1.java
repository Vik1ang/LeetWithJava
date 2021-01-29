package tree.medium.q1008;

import tree.util.TreeNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Vikiang
 * @URL https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class Solution1 {
    int[] preorder;
    int preIndex = 0;
    HashMap<Integer, Integer> IndexMap = new HashMap<>();

    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder;
        int[] inorder = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inorder);

        // build hash map
        int index = 0;
        for (Integer val : inorder) {
            IndexMap.put(val, index++);
        }
        return helper(0, inorder.length);
    }

    private TreeNode helper(int left, int right) {
        if (left == right) {
            return null;
        }

        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);

        int index = IndexMap.get(rootVal);

        preIndex++;
        root.left = helper(left, index);
        root.right = helper(index + 1, right);
        return root;
    }
}
