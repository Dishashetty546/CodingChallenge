package Dreamer.DSA.ArrayNDstring;

import java.util.Arrays;

public class mergesorted {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int[] arr1 = { 1, 3, 4, 6, 8, 0, 0, 0, 0 };
        int[] arr2 = { 5, 6, 7, 8 };
        System.out.println(Arrays.toString(mergesorted(arr1, arr2, m, n)));

    }

    public static int[] mergesorted(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;
        while (j >= 0) {
            if (j >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }

        }
        return arr1;

    }

}
