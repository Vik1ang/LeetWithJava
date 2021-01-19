package tree.util;

import java.util.*;

/**
 * @author Vikiang
 * @URL
 */
public class NaryTreeHelper {

    public void createTree(Node root, List<Integer> data) {
        int index = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.val = data.get(index);
        index++; // skip the first null
        while (!queue.isEmpty()) {
            if (index >= data.size()) {
                break;
            }
            Node node = queue.poll();
            int temp = ++index;
            while (temp < data.size()) {
                if (data.get(temp) == null) {
                    break;
                }
                temp++;
            }
            int childrenNum = temp - index;
            ArrayList<Node> childrenNodes = new ArrayList<>();
            for (int i = 0; i < childrenNum; i++) {
                Node childrenNode = new Node(data.get(index++));
                queue.offer(childrenNode);
                childrenNodes.add(childrenNode);
            }
            node.children = childrenNodes;
            index = temp;
        }
    }

    public void printTree(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.children != null) {
                Collections.reverse(node.children);
                stack.addAll(node.children);
            }
            System.out.print(node.val + " ");
        }
    }
}
