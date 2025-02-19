package Challenges.LEETCODECHALLENGE;
//remove nth node from end of the list

//remove some nde of the linkedlist
//EX: 1,2,3,4,5,null
//o/p:1,2,3,4,null

//steps:
//step1: take a pointer named curr
// initially pointing to first element
// 
public class THIRTYONE {
    public static void main(String[] args) {

        ListNode m1 = new ListNode(1);
        m1.next = new ListNode(2);
        m1.next.next = new ListNode(3);
        int n = 3;
        printList(nth(m1, n));

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;

        }

    }

    public static ListNode nth(ListNode list, int n) {
        ListNode current = list;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;

        }
        if (n == length) {
            list = list.next;
            return list;

        }
        current = list;
        for (int i = 0; i < n - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return list;

    }

    public static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();

    }

}
