package linkedList;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = head.next;
        ListNode pre = new ListNode(-1);
        pre.next = head;

        while (pre.next != null && pre.next.next != null) {
            ListNode node1 = pre.next;
            ListNode node2 = pre.next.next;

            node1.next = node2.next;
            node2.next = node1;
            pre.next = node2;

            pre = node1;
        }

        return result;

    }


}
