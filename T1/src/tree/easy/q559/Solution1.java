package tree.easy.q559;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution1 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        }

        LinkedList<Integer> heights = new LinkedList<>();
        for (Node n : root.children) {
            heights.add(maxDepth(n));
        }
        return Collections.max(heights) + 1;
    }
}
