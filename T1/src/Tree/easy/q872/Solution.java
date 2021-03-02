package Tree.easy.q872;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        LinkedList<TreeNode> tree1 = new LinkedList<>();
        LinkedList<TreeNode> tree2 = new LinkedList<>();

        tree1.addFirst(root1);
        tree2.addFirst(root2);

        fillTree(arrayList1, tree1);
        fillTree(arrayList2, tree2);

        System.out.println(Arrays.toString(arrayList1.toArray()));
        System.out.println(Arrays.toString(arrayList2.toArray()));

        return arrayList1.equals(arrayList2);
    }

    private void fillTree(ArrayList<Integer> arrayList, LinkedList<TreeNode> tree) {
        while (!tree.isEmpty()) {
            TreeNode node = tree.pollFirst();
            if (node.left == null && node.right == null) {
                arrayList.add(node.val);
            }
            if (node.left != null) {
                tree.addFirst(node.left);
            }
            if (node.right != null) {
                tree.addFirst(node.right);
            }
        }
    }


}
