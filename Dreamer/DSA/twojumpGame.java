package Dreamer.DSA;

public class twojumpGame {
    public static void main(String[] args)

    {
        int[] nums = { 1, 2, 3, 4, 6, 7 };
        System.out.println(two(nums));
    }

    public static int two(int[] nums) {

        int numjump = 0;
        int des = nums.length - 1;
        int coverage = 0;
        int lastid = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastid) {
                lastid = coverage;
                numjump++;
                lastid = coverage;

                if (coverage >= des) {
                    return numjump;
                }
            }
        }
        return numjump;
    }
}
