package tree.easy.q897;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/increasing-order-search-tree/
 */

@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    int val;
    tree.easy.q617.TreeNode left;
    tree.easy.q617.TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}