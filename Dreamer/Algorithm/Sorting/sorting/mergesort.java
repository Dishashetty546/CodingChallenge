package Algorithm.Sorting.sorting;

import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);

        }
        System.out.println("Array before sorting: ");
        printSolution(arr);
        long StartTime = System.nanoTime();
        mergeInplace(arr, 0, arr.length);
        long EndTime = System.nanoTime();
        long TimeTaken = EndTime - StartTime;
        System.out.println("Array after sorting :");
        printSolution(arr);

        System.out.println("Time taken to sort an Array of size" + n + ":" + TimeTaken);

    }

    public static void mergeInplace(int[] arr, int s, int e) {
        int n = arr.length;
        int mid = (e + s) / 2;
        if (e - s < 2) {
            return;
        } else {
            mergeInplace(arr, s, mid);
            mergeInplace(arr, mid, e);
            merge(arr, s, mid, e);

        }
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid;
        int k = 0;
        int[] array = new int[e - s];
        while (i < mid && j < e) {
            if (arr[i] <= arr[j]) {
                array[k++] = arr[i++];
            } else {
                array[k++] = arr[j++];
            }
        }
        if (i < mid) {
            array[k++] = arr[i++];
        }
        if (j < e) {
            array[k++] = arr[j++];
        }
        for (int l = 0; l < array.length; l++) {
            arr[s + l] = array[l];
        }

    }

    public static void printSolution(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}