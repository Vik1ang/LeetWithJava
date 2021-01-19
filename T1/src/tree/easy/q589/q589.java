package tree.easy.q589;

import tree.util.NaryTreeHelper;
import tree.util.Node;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class q589 {
    public static void main(String[] args) {
        Node root = new Node();
        NaryTreeHelper naryTreeHelper = new NaryTreeHelper();
        List<Integer> input = Arrays.asList(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14);
        naryTreeHelper.createTree(root, input);

        System.out.println(new Solution1().preorder(root));
    }
}
