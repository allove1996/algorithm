package linkedList;

public class MergeTwoLists {


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


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }else if (l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }

    }

}
