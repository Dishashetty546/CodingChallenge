package Slidingwindow;

public class subarraysun {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 3;
        System.out.println(sumsubarray(nums, target));

    }

    public static int sumsubarray(int[] nums, int target) {
        int sumofvalues = 0;
        int minsumofvalues = Integer.MAX_VALUE;
        int j = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            sumofvalues += nums[i];
            while (sumofvalues > target) {
                minsumofvalues = Math.min(minsumofvalues, j + i - 1);
                sumofvalues -= nums[j];
                j++;
            }

        }
        return minsumofvalues == Integer.MAX_VALUE ? 0 : minsumofvalues;

    }

}