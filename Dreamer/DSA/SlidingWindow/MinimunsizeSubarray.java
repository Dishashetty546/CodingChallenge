package Dreamer.DSA.SlidingWindow;

public class MinimunsizeSubarray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int target = 11;
        System.out.println(minimum(nums, target));

    }

    public static int minimum(int[] nums, int target) {
        int minsize = Integer.MAX_VALUE;

        int currentarray = 0;
        int low = 0;
        for (int high = 0; high < nums.length; high++) {
            currentarray += nums[high];
            while (currentarray >= target) {
                minsize = Math.min(minsize, high - low + 1);
                currentarray -= nums[low];
                low++;
            }

        }
        return minsize == Integer.MAX_VALUE ? 0 : minsize;

    }

}
