package Tree.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/binary-tree-paths/
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
