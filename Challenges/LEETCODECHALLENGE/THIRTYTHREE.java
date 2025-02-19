package Challenges.LEETCODECHALLENGE;

import java.util.*;

//REMOVE duplicate elements from Linked List
//approach 1: using pointers
//TIME COMPLEXITY- O(N) ND SPACE COMPLEXITY - O(1)
public class THIRTYTHREE {
    public static void main(String[] args) {
        ListNode m1 = new ListNode(1);
        m1.next = new ListNode(3);
        m1.next.next = new ListNode(3);
        printlist(Remove(m1));

    }

    static class ListNode {
        int var;
        ListNode next;

        ListNode(int x) {
            var = x;
            next = null;
        }
    }

    public static ListNode Remove(ListNode head) {
        ListNode prev = head;
        ListNode temp = prev.next;
        while (temp != null) {
            if (temp.var == prev.var) {
                temp = temp.next;
                continue;
            } else {
                prev.next = temp;
                prev = temp;
                temp = temp.next;
            }
        }
        prev.next = null;
        return head;
    }

    public static void printlist(ListNode head) {
        while (head != null) {
            System.out.println(head.var + " ");
            head = head.next;
        }
        System.out.println();
    }
}
