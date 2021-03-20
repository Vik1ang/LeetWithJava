package LinkedList.easy.q206;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-linked-list/
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
