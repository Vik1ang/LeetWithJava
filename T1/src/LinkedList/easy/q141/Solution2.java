package LinkedList.easy.q141;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/linked-list-cycle/
 */
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
