package Dreamer.DSA.LinkedList;

public class RemoveNthNodeFromListEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;

        printlist(remove(head, n));

    }

    public static ListNode remove(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fptr = dummy;
        ListNode sptr = dummy;

        for (int i = 0; i <= n; i++) {
            sptr = sptr.next;
        }
        while (sptr != null) {
            fptr = fptr.next;
            sptr = sptr.next;
        }

        fptr.next = fptr.next.next;
        return dummy.next;

    }

    public static void printlist(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
