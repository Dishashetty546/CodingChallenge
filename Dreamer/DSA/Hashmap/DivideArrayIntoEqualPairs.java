package Dreamer.DSA.Hashmap;

import java.util.*;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(divide(nums));

    }

    public static boolean divide(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);

            }
            map.put(nums[i], map.get(nums[i]) + 1);

        }
        for (int count : map.values()) {
            if (count % 2 != 0) {
                return true;
            }

        }
        return false;

    }

}
