package linkedList;

import java.util.List;

public class ReverseList {


    ListNode result;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    /*{
        ListNode pre = null;
        ListNode curr = head;
        doReverse(pre, curr);
        return result;
    }

    private ListNode doReverse(ListNode pre, ListNode curr) {
        if (curr == null || curr.next == null) {
            result = curr;
            return curr;
        }

        ListNode next = doReverse(curr, curr.next);
        curr.next = pre;
        next.next = curr;

        return curr;
    }*/


    /*{
        if (head == null) {
            return head;
        }

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }*/

    public static void main(String[] args) {
        ListNode head = ListNode.getTestParam();
        ListNode result = new ReverseList().reverseList(head);
        ListNode.printListNode(result);
    }
}
