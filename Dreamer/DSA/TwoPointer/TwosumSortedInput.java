package Dreamer.DSA.TwoPointer;

import java.util.Arrays;

public class TwosumSortedInput {
    public static void main(String[] args) {
        int[] input = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(sum(input, target)));

    }

    public static int[] sum(int[] input, int target) {
        int i = 0;
        int sum = 0;
        int j = input.length - 1;
        while (j >= i) {
            sum = input[i] + input[j];
            if (sum > target) {
                j--;

            } else if (sum < target) {
                i++;
            } else {
                return new int[] { i + 1, j + 1 };
            }

        }
        return new int[] { i + 1, j + 1 };
    }

}
