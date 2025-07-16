package Dreamer.DSARevise;

import java.util.*;
//Add two numbers represented by linked lista
//i/p: 2->4->3 + 5->6->4
//o/p: 7->0->8

//approach
//1.create a dummy node to store the result
//2.create a current node to point to the dummy node
//3.create a carry variable to store the carry value
//4.traverse both linked lists until both are null and carry is 0

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = AddNumbers(l1, l2);
        printList(res);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode AddNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null && l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }

}
