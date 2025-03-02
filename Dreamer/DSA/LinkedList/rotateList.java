package Dreamer.DSA.LinkedList;

public class rotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        printlist(rotate(head, k));

    }

    public static ListNode rotate(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;

        } else {
            int length = 0;
            ListNode tail = head;
            while (tail.next != null) {
                length++;
                tail = tail.next;
            }
            length++;
            tail.next = head;
            int rotatepoint = length - k % length;
            tail = head;
            while (rotatepoint-- > 1) {
                tail = tail.next;
            }
            head = tail.next;
            tail.next = null;
            return head;
        }

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
