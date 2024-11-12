package LEETCODECHALLENGE;

//Middle of linkedList

//in array to find middle elemets, we divide the array its 2 halves,middle element will be the one we get 

//but in array we do not know size 

//ex: nodes  - 4,8,15,16,23
//o/p: 15

//ex: nodes - 4,8,15,16,23,42
//o/p:16

//brute force approach

//first you'll find the size of the node - first iteration to find that
//then divide number of nodes bby 2, the resultant node element would be the ans  -2nd iteration

//but this appraoch takes 2 iterations to find the resultant
public class FOURTYSIX {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void resultant(ListNode head) {

    }

}
