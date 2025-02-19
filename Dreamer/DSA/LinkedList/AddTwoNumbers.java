package Dreamer.DSA.LinkedList;

import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = numbers(l1, l2);
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

    public static ListNode numbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); // Initialize with a dummy node
        ListNode ptr = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) {
            ptr.next = new ListNode(1); // Add a new node with carry value
        }

        return result.next; // Skip the dummy head node
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + "->");
            head = head.next;
        }
        System.out.println("null");

    }
}
