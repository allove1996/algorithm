package linkedList;

public class ReverseList {


    public ListNode reverseList(ListNode head) {
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
    }

    public static void main(String[] args) {
        int x = 4, y = 5;

        int z = x ^ y;

        System.out.println(z);
    }
}
