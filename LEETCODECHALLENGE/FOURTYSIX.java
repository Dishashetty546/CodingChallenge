package LEETCODECHALLENGE;

import java.util.*;
//Middle of linkedList

//in array to find middle elemets, we divide the array its 2 halves,middle element will be the one we get 

//but in array we do not know size 

//ex: nodes  - 4,8,15,16,23
//o/p: 15

//ex: nodes - 4,8,15,16,23,42
//o/p:16

//brute force approach

//first you'll find the size of the node - first iteration to find that
//then divide number of nodes by 2, the resultant node element would be the ans  -2nd iteration

//but this appraoch takes 2 iterations to find the resultant - hogh complexity

//approach 1:
//4,8,16,23,null
//taking 2 pointer , slow and fast, 
//slow pointer traverse through list, one node at a time
//whereas fast pointer traverse two node at a time
//now ,till then fast pointer reaches null, slow pointer will be at middle node of list
//this algo name is hare and tortoise algorithm
public class FOURTYSIX {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(16);
        head.next.next.next = new ListNode(23);
        ListNode results = ListNode.resultant(head);
        System.out.println(results);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode resultant(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;

    }

    // toString() method to the ListNode class. Without this method, when you try to
    // print System.out.println(result);, Java doesn’t know how to represent a
    // ListNode as a string. By default, it would print the object’s memory address
    // instead of the node’s value.

    // This helps catch bugs early, as it ensures that you’re actually overriding a
    // method rather than accidentally creating a new one due to typos or mismatched
    // parameters.

    public String toString() {
        return String.valueOf(val);
    }
}
