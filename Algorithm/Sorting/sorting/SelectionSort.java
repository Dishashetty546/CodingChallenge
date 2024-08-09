package Algorithm.Sorting.sorting;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        Random random = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10000);
        }
        System.out.println("Array before sorting :");
        printSolution(arr);
        long starttime = System.nanoTime();
        SelectionSorting(arr);
        long endtime = System.nanoTime();
        long totaltime = endtime - starttime;
        System.out.println("Array after sorting");
        printSolution(arr);
        System.out.println("Time taken to sort" + n + ":" + totaltime + "ns");

    }

    public static void SelectionSorting(int[] arr) {
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

    }

    public static void printSolution(int[] arr) {
        System.out.println(Arrays.toString(arr));

    }

}