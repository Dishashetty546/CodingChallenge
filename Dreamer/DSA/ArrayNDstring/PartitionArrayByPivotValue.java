package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class PartitionArrayByPivotValue {
    public static void main(String[] args) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        System.out.println(Arrays.toString(ArrangeByPivot(nums, pivot)));

    }

    public static int[] ArrangeByPivot(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i : nums) {
            if (i < pivot)
                ans[index++] = i;

        }
        for (int i : nums) {
            if (i == pivot)
                ans[index++] = i;

        }
        for (int i : nums) {
            if (i > pivot)
                ans[index++] = i;

        }

        return ans;
    }
}
