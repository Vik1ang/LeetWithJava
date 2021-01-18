package tree.easy.q100;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/same-tree/
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
