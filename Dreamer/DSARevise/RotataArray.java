package Dreamer.DSARevise;

import java.util.*;
//rotate array with k value

//nums={1,2,3,4,5,6,7}
//int k=3
//o/p: k=1;
//{7,1,2,3,4,5,6}
//k=2
//{7,6,1,2,3,4,5}
//k=3
//{5,6,7,1,2,3,4}

//3 step reverse, firt, reverse from 0 to n-1
//second, 0 to k-1
//third, k-1 to n-1

//complexity
//time: O(N)
//Space: O(1)

public class RotataArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
