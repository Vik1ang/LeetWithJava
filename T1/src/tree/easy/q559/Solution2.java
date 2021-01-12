package tree.easy.q559;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL
 */
public class Solution2 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            depth++;
            while (count > 0) {
                count--;
                Node cur = queue.poll();
                for (Node node : cur.children) {
                    if (node != null) {
                        queue.add(node);
                    }
                }
            }
        }
        return depth;
    }
}
