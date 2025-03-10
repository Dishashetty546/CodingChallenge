package Dreamer.DSA.SlidingWindow;

public class AlteratingGroup2 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 0, 1, 0, 1 };
        int k = 6;
        System.out.println(isAlternating(nums, k));

    }

    public static int isAlternating(int[] nums, int k) {
        int n = nums.length;
        System.out.println(n);
        if (k > n) {
            return 0;
        }
        int l = 0;
        int res = 0;
        for (int r = 1; r < n; r++) {
            if (nums[r] == nums[r - 1]) {
                l = r;
            }

            if (r - l + 1 >= k) {
                res++;

            }
        }
        return res;

    }

}
