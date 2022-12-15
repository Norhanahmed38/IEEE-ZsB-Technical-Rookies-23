public class MergeTwoSortedLists {

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        ListNode temp;
        if (l1.val < l2.val) {
            temp = head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            temp = head = new ListNode(l2.val);
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while (l1 != null) {
            temp.next = new ListNode(l1.val);
            l1 = l1.next;
            temp = temp.next;
        }
        // Add all the nodes in l2, if remaining
        while (l2 != null) {
            temp.next = new ListNode(l2.val);
            l2 = l2.next;
            temp = temp.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}