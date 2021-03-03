package LinkedList.medium.q2;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/add-two-numbers/
 */
public class Solution1 {
    // Does not work if the sum is greater than int range
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        ListNode head = new ListNode(0);
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                s1.append(l1.val);
            }
            if (l2 != null) {
                s2.append(l2.val);
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        s1.reverse();
        s2.reverse();
        int sum = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(sum));
        sb.reverse();
        ListNode curr = head;
        for (int i = 0; i < sb.length(); i++) {
            curr.next = new ListNode((int) sb.charAt(i) - (int) ('0'));
            curr = curr.next;
        }
        return head.next;
    }
}
