package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class productexceptself {
    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(product(nums)));

    }

    public static int[] product(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            left[i] = temp;
            temp = temp * nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            right[i] = temp;
            temp = temp * nums[i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];

        }
        return result;

    }

}
