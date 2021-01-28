package tree.util;



import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL
 */
public class TreeHelper {
    public void createTree(TreeNode node, List<Integer> data) {
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        node.val = data.get(index);
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            Integer left = null;
            if (index + 1 < data.size()) {
                left = data.get(++index);
            }
            Integer right = null;
            if (index + 1 < data.size()) {
                right = data.get(++index);
            }
            if (left == null) {
                treeNode.left = null;
            } else {
                TreeNode leftNode = new TreeNode(left);
                treeNode.left = leftNode;
                queue.offer(leftNode);
            }
            if (right == null) {
                treeNode.right = null;
            } else {
                TreeNode rightNode = new TreeNode(right);
                treeNode.right = rightNode;
                queue.offer(rightNode);
            }
        }

    }

    public TreeNode getTreeNode(TreeNode root, int val) {
        if (root.val == val) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == val) {
                return node;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return null;
    }


    public void preorder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        preorder(node.left);
        System.out.print(node.val + " ");
        preorder(node.right);
    }

    public void postorder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.val + " ");
    }

    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print(root.val + " ");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                continue;
            }
            if (node.left != null) {
                System.out.print(node.left.val + " ");
                queue.offer(node.left);
            } else {
                System.out.print("null ");
            }
            if (node.right != null) {
                System.out.print(node.right.val + " ");
                queue.offer(node.right);
            } else {
                System.out.print("null ");
            }

        }
    }
}
