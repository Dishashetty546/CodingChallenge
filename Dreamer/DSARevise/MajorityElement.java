package Dreamer.DSARevise;

import java.util.*;
//Majority element

//array nums, size n
//return majority element
//majority - element that appears more than n/2 times

//num=[3,2,3]
//o/p:3

//approach:
//use hashmap to store all duplicate elements using its frequency count
//then calculate majority elements of particular nums
//check for majority elements
//return majority elements

//complexity
//time: O(n)
//space: O(n) coz we use map to store 
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majority(nums));

    }

    public static int majority(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        int maj = nums.length / 2;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maj) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

}
