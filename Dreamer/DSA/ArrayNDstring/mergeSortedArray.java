package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] >= nums2[p2]) {
                nums1[i--] = nums1[p1--];

            } else {
                nums1[i--] = nums2[p2--];
            }
        }

        return nums1;

    }

}
