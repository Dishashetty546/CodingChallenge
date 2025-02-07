package Dreamer.DSA.ArrayNDstring;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = { 5, 0, 4, 2, 0 };

        System.out.println(jump(nums));
    }

    public static boolean jump(int[] nums) {
        int finaldes = nums.length - 1;
        for (int index = nums.length - 2; index >= 0; index--) {
            if (index + nums[index] >= finaldes) {
                finaldes = index;
            }

        }
        return finaldes == 0;

    }

}
