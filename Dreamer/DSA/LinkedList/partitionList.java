package Dreamer.DSA.LinkedList;

public class partitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        printList(partition(head, x));

    }

    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode smallhead = small;
        ListNode highhead = high;
        while (head != null) {
            if (head.val < x) {
                smallhead.next = head;
                smallhead = smallhead.next;
            } else {
                highhead.next = head;
                highhead = highhead.next;
            }
            head = head.next;
        }

        smallhead.next = high.next;
        highhead.next = null;
        return small.next;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void printList(ListNode head)

    {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
