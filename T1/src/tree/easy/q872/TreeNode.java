package tree.easy.q872;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/leaf-similar-trees/
 */

@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
