package LEETCODECHALLENGE;

// Linked list cycle detection

// Example: head = [3,2,0,-4], pos = 1
// Output: true
// 3 -> 2 -> 0 -> -4 -> (cycle back to node with value 2)
//Basic understanding of linked list is necessary
//steps:
//step1: create a linkedList called ListNode
//step2: 2 pointers slowptr and fastptr, both are initially at head
//step3: traversal continues till it terminates the while loop ( condition: fast is not equal to null)
//slowptr= slowptr.head and fastptr= fastptr.head.head
//till, fast==slow, return true , else return false

public class TWENTYNINE {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle for testing

        boolean cyclist = linked(head);
        System.out.println(cyclist); // Should print true
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean linked(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

            if (fastptr == slowptr) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }
}
