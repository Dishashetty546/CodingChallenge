package LEETCODECHALLENGE;

// MAXIMUM subarray sum
// task is, given an array of elements, find a subarray out of it, whose sum is
// max of all the subarrays
// i/p:[-2,1,-3,4,-1,2,1,-5,4]
// o/p: 6
// subarray:[4,-1,2,1]

// brute force approach
// complexity: time: O(n^2)
// space : o(1)
// public class FIFTYNINE {
// public static void main(String[] args) {
// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// System.out.println(maximum(nums));

// }

// public static int maximum(int[] nums) {
// int max = Integer.MIN_VALUE;
// int n = nums.length;
// for (int i = 0; i < n - 1; i++) {
// int current = 0;
// for (int j = i; j < n; j++) {
// current = current + nums[j];
// max = Math.max(current, max);

// }
// }
// return max;
// }

// }

// Approach 1:
// public class FIFTYNINE {
// public static void main(String[] args) {
// int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// System.out.println(maximun(nums));

// }

// public static int maximun(int[] nums) {

// int max = nums[0];
// int current = nums[0];
// for (int i = 1; i < nums.length; i++) {
// current = Math.max(nums[i], current + nums[i]);
// max = Math.max(current, max);

// }
// return max;

// }
// }
// Complexity
// Time: o(n)
// space:o(1)