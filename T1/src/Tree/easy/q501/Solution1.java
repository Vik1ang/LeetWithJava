package Tree.easy.q501;

import Tree.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class Solution1 {
    HashMap<Integer, Integer> hashMap;

    public int[] findMode(TreeNode root) {
        hashMap = new HashMap<>();
        dfs(root);
        Set<Integer> fre = hashMap.keySet();
        HashMap<Integer, Integer> helperHash = new HashMap<>();
        Integer max = -1;
        for (Integer val : fre) {
            Integer i = hashMap.get(val);
            if (i > max) {
                max = i;
                helperHash.clear();
                helperHash.put(val, i);
            } else if (i.equals(max)) {
                helperHash.put(val, i);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> helperSet = helperHash.keySet();
        arrayList.addAll(helperSet);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        // Integer count = hashMap.get(root.val) != null ? hashMap.get(root.val) : 0;
        hashMap.put(root.val, hashMap.get(root.val) != null ? hashMap.get(root.val) + 1 : 1);
    }

}
