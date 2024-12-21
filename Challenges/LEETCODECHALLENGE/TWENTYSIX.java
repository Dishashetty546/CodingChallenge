package LEETCODECHALLENGE;

import java.util.*;

public class TWENTYSIX {
    // contains duplicate II
    // EX: {1,2,3,1}, k=3, here 1 is present in index 0, and another 1 in index 3,
    // then 3-0=3, return true---->finding distance by abs(i-j)
    // o/p: true

    // steps:storing elements in array--> iterate through the array through pointer
    // store key and value--> key-digit, value-frequency of digit
    //

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(duplicate(nums, k));

    }

    public static boolean duplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int diff = Math.abs(i - map.get(nums[i]));
                if (diff <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }

        }
        return false;

    }
}
