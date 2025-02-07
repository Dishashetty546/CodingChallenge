package Dreamer.DSA.ArrayNDstring;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(index(nums));
    }

    public static int index(int[] nums) {
        Arrays.sort(nums); // Sort in ascending order
        int n = nums.length;

        // Traverse from the end of the array to find the h-index
        for (int i = 1; i < n; i++) {
            // Check if the number of citations (nums[i]) is >= to the number of papers (n -
            // i)
            if (nums[n - i - 1] < i + 1) {
                return i; // Return the h-index when the condition fails
            }
        }

        return n; // If all papers satisfy the condition, return the length of the array
    }
}
