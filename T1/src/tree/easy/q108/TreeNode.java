package tree.easy.q108;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Vikiang
 * @URL
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
