// package LEETCODECHALLENGE;
// //find duplicate in an array of elements

// //ex: 1,3,4,2,2
// //o/p: 2

// //brute force solution
// //take 1 element from array, ex: 1, search for 1 throughout, 1 is absent,
// hence its unique of all elements, do that for all
// public class FIFTY {
// static int k;

// public static void main(String[] args) {
// int[] nums = { 2, 5, 4, 7, 5 };
// System.out.println(duplicate(nums));

// }

// public static int duplicate(int[] nums) {
// for (int i = 0; i < nums.length - 1; i++) {
// for (int j = 1; j < nums.length - 1; j++)

// if (nums[i] != nums[j]) {
// i++;
// j++;
// } else {
// k = nums[j];

// }

// }
// return k;
// }

// }

// this approach is n't feasible, because it is iterating through array several
// times
// time complexity = "0(n*n)"
// space complexity = "0(1)" //as we didnt use any extra space

// efficient approach
// approach 1: using sorting approach

// public class FIFTY {
// public static void main(String[] args) {
// int[] nums = { 3, 4, 5, 6, 2, 4 };
// System.out.println((duplicate(nums)));

// }

// public static int duplicate(int[] nums) {
// Arrays.sort(nums);

// for (int i = 0; i < nums.length - 1; i++) {
// if (nums[i] == nums[i + 1]) {
// return nums[i];
// }
// }
// return -1;

// }
// }

// time complexity : o(n log n)

// approach 2: using hashset