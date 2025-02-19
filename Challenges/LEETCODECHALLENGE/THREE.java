package Challenges.LEETCODECHALLENGE;//--

import java.util.*;

//FIND MAJORITY ELEMENT

public class THREE {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majority(nums));

    }

    public static int majority(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int majority = (nums.length / 2);
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                result = entry.getKey();
            }
        }
        return result;
    }

}
