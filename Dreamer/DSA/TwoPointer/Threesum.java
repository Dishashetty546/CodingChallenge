package Dreamer.DSA.TwoPointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Threesum {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1 };
        System.out.println(sum(nums));

    }

    public static List<List<Integer>> sum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return result;

    }

}
