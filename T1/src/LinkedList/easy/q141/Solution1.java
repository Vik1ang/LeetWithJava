package LinkedList.easy.q141;

import LinkedList.util.ListNode;

import java.util.HashSet;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/linked-list-cycle/
 */
public class Solution1 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (!hashSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
