package tree.easy.q671;

import tree.util.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class Solution3 {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        HashSet<Integer> hashSet = new HashSet<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            hashSet.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        int[] res = hashSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(res);
        int sec = res[0];
        for (int i = 0; i < res.length; i++) {
            if (res[i] > sec) {
                sec = res[i];
                break;
            }
        }
        return sec == res[0] ? -1 : sec;
    }
}
