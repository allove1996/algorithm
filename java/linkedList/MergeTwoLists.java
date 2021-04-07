package linkedList;

public class MergeTwoLists {

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(-1);
        ListNode result = curr;
        doMerge(curr, l1, l2);
        return result.next;
    }

    public void doMerge(ListNode curr, ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            curr.next = l1 != null ? l1 : l2;
            return;
        }

        if (l1.val <= l2.val) {
            curr.next = l1;
            doMerge(curr.next, l1.next, l2);
        } else {
            curr.next = l2;
            doMerge(curr.next, l1, l2.next);
        }


    }

}
