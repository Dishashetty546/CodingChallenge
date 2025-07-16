package Dreamer.DSARevise;
//given

//L1= 1 2 4
//L2= 1 3 4
//MERGED= 1 1 2 3 4 4
//BOTH THE LINKED LIST IS SORTED

//approach
//1. create a dummy node
//2. compare the values of both linked list
//3. add the smaller value to the dummy node
//4. move the pointer of the linked list from which the value was taken
//5. repeat until one of the linked list if null
//6. once it is null, add all the remaining nodes of other LL into the dummy node
//.7. return the dummy next

//complexity
//time: O(m+n) m is length of l1, and n is length of l2
//space: O(1) no extra space is used
//what about the dummy node? its not a extra space, its  just a pointer 

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode reversedHead = merge(l1, l2);

        // Printing the reversed linked list
        print(reversedHead);
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }

    public static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;

    }

}
