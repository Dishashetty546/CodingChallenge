package Challenges.LEETCODECHALLENGE;

// REVERSE LINKED LIST
// APROACH 1:
// EX; 123
// O/P:321
// hint: using first in last out approach
// create a Stack
// run a while loop until head is null - push elements into stack
// create another LinkedList reversedlist
// while loop until valueStack is empty
// pop all the elements from the stack into reversedlist
// return reversedlist
// import java.util.*;

// public class THIRTYTWO {
// public static void main(String[] args) {
// ListNode m1 = new ListNode(1);
// m1.next = new ListNode(2);
// m1.next.next = new ListNode(3);
// printList(reverse(m1));

// }

// static class ListNode {
// int var;
// ListNode next;

// ListNode(int x) {
// var = x;
// next = null;
// }

// }

// public static ListNode reverse(ListNode head) {
// Stack<Integer> valuestack = new Stack<>();
// while (head != null) {
// valuestack.push(head.var);
// head = head.next;
// }
// ListNode reversedList = new ListNode(0);
// ListNode ptr = reversedList;
// while (!valuestack.isEmpty()) {
// ptr.next = new ListNode(valuestack.pop());
// ptr = ptr.next;

// }
// return reversedList.next;
// }

// public static void printList(ListNode head) {
// while (head != null) {
// System.out.print(head.var + " ");
// head = head.next;
// }
// System.out.println();
// }
// }

// APPROACH 2:
// without using extra space
// using default pointers in LinkedList
// taking 3 pointers and changing their pointing elements
// Time complexity - O(N) as we iterate through each element
// space complecity - O(1) as we are not using any data structure extra
// public class THIRTYTWO {
// public static void main(String[] args) {

// ListNode m1 = new ListNode(1);
// m1.next = new ListNode(2);
// m1.next.next = new ListNode(3);
// printList(pointer(m1));
// }

// static class ListNode {
// int var;
// ListNode next;

// ListNode(int x) {
// var = x;
// next = null;
// }

// }

// public static ListNode pointer(ListNode head) {
// if (head == null) {
// return null;
// }
// if (head.next == null) {
// return null;
// }
// ListNode prevnode = null;
// ListNode curnode = head;
// while (curnode != null) {
// ListNode nextnode = curnode.next;
// curnode.next = prevnode;
// prevnode = curnode;
// curnode = nextnode;
// }
// return prevnode;
// }

// public static void printList(ListNode head) {
// while (head != null) {
// System.out.println(head.var);
// head = head.next;
// }
// System.out.println();
// }
// }
