package Arrays;

import java.util.Arrays;

public class productarraysexceptself {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(product(nums)));

    }

    public static int[] product(int[] nums) {
        int leftproduct[] = new int[nums.length];
        int rightproduct[] = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            leftproduct[i] = temp;
            temp *= nums[i];

        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            rightproduct[i] = temp;
            temp *= nums[i];
        }
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftproduct[i] * rightproduct[i];
        }
        return result;
    }

}
