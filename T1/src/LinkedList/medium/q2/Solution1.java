package LinkedList.medium.q2;

import LinkedList.util.ListNode;

/**
 * @author Vikiang
 * @URL https://leetcode.com/problems/add-two-numbers/
 */
public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (l1 != null) {
            s1.append(String.valueOf(l1.val));
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.append(String.valueOf(l2.val));
        }
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        int sum = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
        String str = String.valueOf(sum);
        for (int i = 0; i < str.length(); i++) {
            temp.next = new ListNode(Integer.parseInt(String.valueOf(str.charAt(i))));
            temp = temp.next;
        }
        return listNode.next;
    }
}
