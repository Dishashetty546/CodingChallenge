package LEETCODECHALLENGE;
//Rotated sorted array

//ex: 9.10,11,0,1,2,3,4,5,6,7,8
//this array is sorted but is rotated numbe of times, a target value will be given, our task is to find the index of that 
//target - 7
//return 10

//approach - 1
//rotate the array back
//then using any search technique to search the target element

//time complexity: sorting the array using selection sort - o(n) + search using linear search o(n)

import java.util.Arrays;

public class FIFTYFIVE {
    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 0, 1, 2, 3, 4, 5, 6 };
        // int target = 7;
        System.out.println(Arrays.toString(sort(arr)));
        int target = 6;
        System.out.println(search(arr, target));

    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;

    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;

    }

}