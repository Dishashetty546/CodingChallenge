package Challenges.LEETCODECHALLENGE;

//MERGE SORTED LIST
//heads of 2 sorted list given
//EX: m1={1,2,4}
//    m2={1,3,4}
//o/p: {1,1,2,3,4,4}
//steps:
// take 3 pointers cur, list1, list2
// first list1 points on m1 array first element and list2 points on m2 array first element
// check(  if(l1<l2))
// if( l2 is smaller) curr will point over there l2
// l2 ++
// again loop continues( l1<l2)
//l2 is smaller , then curr will point on that element
//l2++
//untill list is null
//path where curr point is merged sorted list

//step1: create a dummy list pointer pointing to -1 position
//keep dummy as current
//take a while loop until, list 1 == null and list2 == null

public class THIRTY {
    public static void main(String[] args) {
        ListNode m1 = new ListNode(1);
        m1.next = new ListNode(2);
        m1.next.next = new ListNode(4);

        ListNode m2 = new ListNode(1);
        m2.next = new ListNode(3);
        m2.next.next = new ListNode(4);

        ListNode mergedList = sorted(m1, m2);
        printList(mergedList);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    public static ListNode sorted(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;

        } else {
            current.next = list2;
        }
        return dummy.next;

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
