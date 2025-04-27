package Dreamer.DSARevise;

//linked list cycle
//num={3,2,0,-4}
//int k=1

//if there is cycle,then we have to return true, or return false

//keeping two pointers, one is slow which jumps in 1 , fast which jumps in 2
//if slow and fast are equal, then return 

//complexity
//time: O(n)
//space: O(n)
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        printList(head);
        System.out.println(cycle(head));

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
