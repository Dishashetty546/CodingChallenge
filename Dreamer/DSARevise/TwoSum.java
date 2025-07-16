package Dreamer.DSARevise;
//Array - {2,7,11,15}

//target - 9
//o/p: [0,1]

//approach
//create hashmap
//store number and its index
//req.num= 9-value = numbers
//check if numbers is present in hashmap
//if not, store it in it - ex: [2,0] numbers,index
//if in next interation if we find that number , then return it with its index
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 3, 1, 4 };
        int target = 9;
        System.out.println(Arrays.toString(Sum(nums, target)));
    }

    public static int[] Sum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)

        {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                int[] arr = { map.get(req), i };
                return arr;

            } else {
                map.put(nums[i], i);
            }
        }
        return null;

    }

}
