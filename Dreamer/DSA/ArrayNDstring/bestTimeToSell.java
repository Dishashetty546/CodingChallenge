package Dreamer.DSA.ArrayNDstring;

public class bestTimeToSell {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 4, 1, 4 };
        System.out.println(bestTime(nums));

    }

    public static int bestTime(int[] nums) {

        int minprofit = nums[0];
        int maxprofit = 0;
        for (int i = 1; i < nums.length; i++) {
            minprofit = Math.min(minprofit, nums[i]);
            int profit = nums[i] - minprofit;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }

}
