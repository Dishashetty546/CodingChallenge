package Dreamer.DSA.LinkedList;

public class reverseLinkedListTwo {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        int left = 2;
        int right = 3;

        ListNode newHead = reverseBetween(head, left, right);
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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node before the reversal starts
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevReversed = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prevReversed;
            prevReversed = curr;
            curr = next;
        }

        // Connect the reversed portion back
        prev.next.next = curr;
        prev.next = prevReversed;

        return dummy.next;
    }
}
