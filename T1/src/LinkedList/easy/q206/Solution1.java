package LinkedList.easy.q206;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/reverse-linked-list/
 */
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
