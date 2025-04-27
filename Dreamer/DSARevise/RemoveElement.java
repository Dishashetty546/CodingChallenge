package Dreamer.DSARevise;
//remove element

//integer array num1 and integer val
//remove occurenace of val in num1
//then return no. of elements in num , where there is no occurance of val

//num=[0,1,2,2,3,0,4,2]
//val=2
//o/p:5, num=[0,0,1,3,4] , can be any order

//approach
//first calculate len of array num, then take a pointer i pointing to first element
//if num[i] is equals to val
//then replace num[len-1] value with num[i]
//then decrease length(l--)
//if not then iterte pointer(i++)
//repeat this until i<length
//return length

//complexity
//time: O(n)
//space:O(1)

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = { 0, 1, 2, 2, 3, 0, 4, 2 };

        int val = 2;
        System.out.println(Remove(num, val));

    }

    public static int Remove(int[] num, int val) {
        int l = num.length;
        int i = 0;
        while (i < l) {
            if (num[i] == val) {
                num[i] = num[l - 1];
                l--;
            } else {
                i++;
            }
        }
        return l;

    }

}
