package Dreamer.DSA.ArrayNDstring;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 7, 3, 6 };
        int k = 4;
        System.out.println(Arrays.toString(rotate(nums, k)));

    }

    public static int[] rotate(int[] nums, int k)

    {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;

    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
}
