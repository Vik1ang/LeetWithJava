package tree.easy.q700;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/search-in-a-binary-search-tree
 */

@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
