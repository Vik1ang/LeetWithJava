package JianzhiOffer.easy.q22;

/**
 * @author Vikiang
 * @URL
 */
public class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node = head;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        ListNode res = head;
        while (len > 0) {
            if (len == k) {
                break;
            }
            len--;
            res = res.next;
        }
        return res;
    }
}
