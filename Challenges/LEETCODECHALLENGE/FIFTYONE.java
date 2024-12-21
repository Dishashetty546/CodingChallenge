package LEETCODECHALLENGE;

// INTERSECTION OF 2 LINKED LIST, FIND THE INTERRSECTION POINTS

import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// EX: 2 -> 4 -> 16 -> 23 ->42
// |
// 4 -> 8 -> 15

// SO HERE O/P: 16
// -------------------------------------------------------------------------------------------------------
// BRUTE SOURCE APPROACH : taking one node adress, comparing it with all the
// node address,
// if its equal, then that is the intersection node , this takes more complexity

// approach
// 1:-------------------------------------------------------------------------------------
// using hashset,

// import java.util.HashSet;

// public class FIFTYONE {
// public static void main(String[] args) {
// // Create two intersecting linked lists
// ListNode intersectionNode = new ListNode(6);

// ListNode head1 = new ListNode(2);
// head1.next = new ListNode(5);
// head1.next.next = intersectionNode; // Intersection starts here
// intersectionNode.next = new ListNode(7);

// ListNode head2 = new ListNode(8);
// head2.next = new ListNode(1);
// head2.next = intersectionNode; // Second list points to the same intersection

// // Find intersection
// ListNode sections = section(head1, head2);

// if (sections != null) {
// System.out.println("Intersection point data: " + sections.val);
// } else {
// System.out.println("No intersection found.");
// }
// }

// // ListNode class
// public static class ListNode {
// int val;
// ListNode next;

// ListNode(int x) {
// val = x;
// next = null;
// }
// }

// // Method to find intersection point
// public static ListNode section(ListNode head1, ListNode head2) {
// HashSet<ListNode> newmap = new HashSet<>();

// // Add all nodes of the first linked list to the HashSet
// ListNode current1 = head1;
// while (current1 != null) {
// newmap.add(current1);
// current1 = current1.next;
// }

// // Traverse the second linked list and check for intersection
// ListNode current2 = head2;
// while (current2 != null) {
// if (newmap.contains(current2)) {
// return current2; // Intersection found
// }
// current2 = current2.next;
// }

// return null; // No intersection
// }
// }

// Time complexity = o(n) for HashSet
// space complexity = o(1)

// ----------------------------------------------------------------------------------------------------------------------------

// approach 2:
// public class FIFTYONE {
// public static void main(String[] args) {
// ListNode intersectionNode = new ListNode(6);

// ListNode head1 = new ListNode(2);
// head1.next = new ListNode(5);
// head1.next.next = intersectionNode; // Intersection starts here
// intersectionNode.next = new ListNode(7);

// ListNode head2 = new ListNode(8);
// head2.next = new ListNode(1);
// head2.next = intersectionNode; // Second list points to the same intersection

// // Find intersection
// ListNode sections = approach2(head1, head2);

// if (sections != null) {
// System.out.println("Intersection point data: " + sections.val);
// } else {
// System.out.println("No intersection found.");
// }

// }

// public static ListNode approach2(ListNode head1, ListNode head2) {
// int len1 = head1.length();
// int len2 = head2.length();
// while (len1 > len2) {
// len1--;
// head1 = head1.next;
// }

// while (len2 > len1) {
// len2--;
// head2 = head2.next;
// }
// while (head1 != head2) {
// head1 = head1.next;
// head2 = head2.next;
// }
// return head1;
// }
// }
