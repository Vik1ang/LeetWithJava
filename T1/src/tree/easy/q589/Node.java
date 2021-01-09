package tree.easy.q589;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
@NoArgsConstructor
@AllArgsConstructor
public class Node {
    public int val;
    public List<Node> children;

    public Node(int _val) {
        val = _val;
    }
}
