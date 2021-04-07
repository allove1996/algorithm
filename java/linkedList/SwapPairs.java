package linkedList;

import com.sun.source.tree.LiteralTree;

import java.util.List;

public class SwapPairs {
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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
