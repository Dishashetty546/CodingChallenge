package Dreamer.DSARevise;

//DAY - 1
import java.util.*;
//given
//2 integer array - num1,num2 - they are sorted  in non decreasing order
//2 intereger m,n no. of elements in num1,num2
//merge num1,num2 into single order
//final value retured should store in num1
//m+n is the size of resultant array

//ex: num1={1,2,3,0,0,0} m=3
//num2={2,5,6} n=3
//o/p:{1,2,2,3,5,6}

//approach
//1.start from the end of num1 and num2
//2.compare the last elements of num1 and num2
//3. if last element of num1 is greater than last element of num2
//4.then place the last element of num1 at the end of num1
//5. decrement the index of num1 and num2

//time and space complexity
//Time complexity: O(m+n)
//space complecity: O(1)

class MergeSorted {
    public static void main(String[] args) {
        int[] num1 = { 1, 2, 2, 0, 0, 0 };
        int m = 3;
        int[] num2 = { 2, 5, 6 };
        int n = 3;
        System.out.println(Arrays.toString(merge(num1, m, num2, n)));

    }

    public static int[] merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = num1.length - 1;

        while (k >= 0) {
            int e1 = (i >= 0) ? num1[i] : Integer.MIN_VALUE;
            int e2 = (j >= 0) ? num2[j] : Integer.MIN_VALUE;
            if (e1 > e2) {
                num1[k] = e1;
                k--;
                i--;
            } else {
                num1[k] = e2;
                k--;
                j--;

            }

        }
        return num1;

    }
}