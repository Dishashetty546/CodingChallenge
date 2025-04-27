package Dreamer.DSA.ArrayNDstring;

public class MaxCountOfNegativeAndPos {
    public static void main(String[] args) {

        int[] nums = { -2, -1, -1, 1, 2, 3 };
        System.out.println(maximumCount(nums));
    }

    public static int maximumCount(int[] nums) {
        int n = nums.length;
        int neg = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos++;
            } else if (nums[i] < 0) {
                neg++;
            }
        }
        return Math.max(neg, pos);
    }

}
