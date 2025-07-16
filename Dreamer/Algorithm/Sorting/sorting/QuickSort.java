package Algorithm.Sorting.sorting;

import java.util.Random;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] sizes = { 5, 10, 15 }; // Array sizes for testing
        Random random = new Random();
        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(100); // Random integers between 0 and 99
            }

            System.out.println("Array before sorting:");
            printarr(arr);

            long starttime = System.currentTimeMillis();
            quicksort(arr, 0, n - 1);
            long endtime = System.currentTimeMillis();

            System.out.println("Array after sorting:");
            printarr(arr);

            long timetaken = endtime - starttime;
            System.out.println("Time taken to sort array of size " + n + ": " + timetaken + " ms");
            System.out.println(); // Extra newline for clarity
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) { // Ensure there are more than one element
            int pindx = partition(arr, low, high);
            quicksort(arr, low, pindx - 1); // Recursively sort elements before partition
            quicksort(arr, pindx + 1, high); // Recursively sort elements after partition
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return the partitioning index
    }

    public static void printarr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
