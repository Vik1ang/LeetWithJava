package tree.easy.q1022;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */

@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.val = value;
    }
}
