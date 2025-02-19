package Dreamer.DSA.LinkedList;

public interface mergeSortedList {
    public static void main(String[] args) {

        ListNode List1 = new ListNode(1);
        List1.next = new ListNode(2);
        List1.next.next = new ListNode(4);

        ListNode List2 = new ListNode(1);
        List2.next = new ListNode(3);
        List2.next.next = new ListNode(4);
        ListNode result = merges(List1, List2);
        printList(result);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    public static ListNode merges(ListNode List1, ListNode List2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (List1 != null && List2 != null) {
            if (List1.val <= List2.val) {
                current.next = List1;
                List1 = List1.next;

            } else {
                current.next = List2;
                List2 = List2.next;

            }
            current = current.next;

        }
        current.next = List1 != null ? List1 : List2;
        return dummy.next;

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + "->");
            head = head.next;
        }

    }

}
