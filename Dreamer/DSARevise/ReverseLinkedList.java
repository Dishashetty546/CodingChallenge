package Dreamer.DSARevise;
//Reverse linked list

//singly linked list
//head is given
//reverse it anf return the list

//head={1,2,3,4,5}
//o/p:{5,4,3,2,1}

//approach:
//take a ListNode p,c,next, where p is pointing to end of listNode, c is pointing to starting of listNode and next is for iteration through ListNOde

//Complexity
//time: O(n), n is no. of nodes
//space: O(1)
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode result = List(l1);
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

    public static ListNode List(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        ListNode next = c.next;
        while (c != null) {
            c.next = p;
            p = c;
            c = next;
            if (next != null) {
                next = c.next;
            }
        }
        return p;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();

    }

}
