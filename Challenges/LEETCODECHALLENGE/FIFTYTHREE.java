package Challenges.LEETCODECHALLENGE;

import java.util.Arrays;
//pairs
//ex: arr= [1,2,3,4]
//    target=1
//o/p:3
// 2-1=1, 3-2=1, 4-3=1

//ex2: arr=[1,5,3,4,2]
//     target=2
//o/p: 3
//3-1=2, 4-2=2, 5-3=2

//brute force approach
//iterating through the array, taking one element from array, taking all possible sums of it
//doing the same for all the elements
//time complexity gets high

//approach 1: taking a sorted array, computing using element from array + ( ) = 2
//compare space value with sorted array

public class FIFTYTHREE {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 3, 4, 2 };
        int target = 2;
        System.out.println(dry(nums, target));

    }

    public static boolean binarysearch(int[] nums, int search) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == search)
                return true;
            if (nums[mid] < search)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return false;
    }

    public static int dry(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        // value of pairs it can make
        for (int i : nums) {
            int search = i - target;
            if (binarysearch(nums, search)) {
                result++;
            }

        }
        return result;

    }

}
