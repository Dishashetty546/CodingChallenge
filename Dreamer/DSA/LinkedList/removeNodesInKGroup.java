package Dreamer.DSA.LinkedList;

public class removeNodesInKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.println(remove(head, n));

    }

    public static ListNode remove(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int c = k;
        while (curr != null && c > 0) {

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
