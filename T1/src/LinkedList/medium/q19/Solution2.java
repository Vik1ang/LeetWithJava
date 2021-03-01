package LinkedList.medium.q19;

import LinkedList.util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode curr = dummy;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;
    }
}
