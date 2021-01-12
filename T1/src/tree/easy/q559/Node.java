package tree.easy.q559;

import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
