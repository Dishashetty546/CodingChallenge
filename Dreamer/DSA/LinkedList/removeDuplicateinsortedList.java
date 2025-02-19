package Dreamer.DSA.LinkedList;

public class removeDuplicateinsortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        ListNode newHead = deleteDuplicates(head);

        printList(newHead);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prev;
        ListNode curr;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        prev = dummy;
        curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;

        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }
}
