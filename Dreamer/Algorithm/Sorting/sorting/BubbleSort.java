package Algorithm.Sorting.sorting;

import java.util.Arrays;
//sorting in ascending order or descndng order
//time complexity
//0(n square)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(sort(arr)));
        }
    }

    public static int[] sort(int[] arr) {
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

}
