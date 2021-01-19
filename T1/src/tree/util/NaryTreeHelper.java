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

    // TODO: do not finish yet, still have bug on print n ary tree
    public void printTree(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                arrayList.add(node.val);
                if (node.children != null) {
                    for (Node n : node.children) {
                        queue.offer(n);
                    }
                }
            }
            arrayList.add(null);
        }

        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
