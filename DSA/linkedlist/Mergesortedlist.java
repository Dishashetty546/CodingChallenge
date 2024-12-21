package linkedlist;

public class Mergesortedlist {
    public static void main(String[] args) {
        // Test the merge function
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedList = merge(list1, list2);
        printList(mergedList); // Print the merged list
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode newNode = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                newNode.next = list1;
                list1 = list1.next;
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }
            newNode = newNode.next; // Move newNode to the next position
        }

        if (list1 == null) {
            newNode.next = list2;
        } else {
            newNode.next = list1;
        }

        return dummy.next; // Return the head of the merged list
    }

    // Utility method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
