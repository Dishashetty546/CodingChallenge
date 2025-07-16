package Algorithm.Sorting.sorting;

import java.util.Arrays;
//time complexit is 0(n^2)

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        System.out.println(Arrays.toString(sort(arr)));

    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int current = arr[i];

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

}
