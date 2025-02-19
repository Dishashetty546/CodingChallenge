package Dreamer.DSA.LinkedList;

import java.util.*;

public class reverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode newHead = list(head);

        printlist(newHead);

    }

    static class ListNode {
        int var;
        ListNode next;

        ListNode(int x) {
            var = x;
            next = null;
        }

    }

    public static void printlist(ListNode head) {
        while (head != null) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.var + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

    }

    public static ListNode list(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;

    }

}
