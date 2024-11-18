package LEETCODECHALLENGE;

import java.util.Arrays;
//GIVEN AN UNSORTED ARRAY, TASK IS TO  SORT THE ARRAY FIRST , THEN GET FIRST AND LAST ELEMENT IN AN ARRAY of a tartget value given
//ex: {45678780}
//target=8
//o/p: 4,6

//brute force approach
//0(n) - 
//o(1) - space 

//approach 1: using divide and conquer approach 
//ex: 0 0 1 1 2 3 5 5 5  5 5 5  5 5 7 7
//target : 5
//divide into 2: look at middle element using mid_element> target & mid_element<target logic

public class FIFTYEIGHT {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 7, 3 };
        int target = 7;

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(SORTED(arr, i)));
        }
        int right = findRightBound(arr, target);
        int left = findLeftBound(arr, target);
        System.out.println(left);
        System.out.println(right);

    }

    // STEP 1: sorting the array , using bubble sort approch - where in , first
    // bubbling the largest element fount to last index, then search for next large
    // element
    public static int[] SORTED(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    // STEP 2: FINDING THE LEFT INDEX ELEMENT , using divide and conquer approach
    private static int findLeftBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                high = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    private static int findRightBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                index = mid;
                low = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

}
