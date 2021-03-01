package LinkedList.medium.q19;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        int length = getLength(head);
        int index = length - n;
        ListNode cur = temp;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return temp.next;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
