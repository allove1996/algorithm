package linkedList;

import java.util.List;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }

    /*{
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }*/

    public static void main(String[] args) {
//        ListNode head = ListNode.getTestParam();
//        ListNode result = new SwapPairs().swapPairs(head);
//        ListNode.printListNode(result);

        ListNode node1 = new ListNode(1);
        ListNode node2 = node1;

        node2.val = 2;

        System.out.println(node1.val);
    }
}
