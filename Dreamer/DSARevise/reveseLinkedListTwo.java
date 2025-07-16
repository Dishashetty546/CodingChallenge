
package Dreamer.DSARevise;

public class reveseLinkedListTwo {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);

        // Reversing the linked list
        ListNode reversedHead = reverse(head);

        // Printing the reversed linked list
        print(reversedHead);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Reverses the linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev forward
            curr = next; // Move curr forward
        }

        return prev;
    }

    // Prints the linked list
    public static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
