package intervals;

import java.util.ArrayList;

import java.util.List;

public class summaryrange {
    public static void main(String[] args)

    {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        System.out.println((valuues(nums)));

    }

    public static List<String> valuues(int[] nums) {

        List<String> list = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = nums[i];
            // Move i to find the end of the current range////0<3 nums[2]==nums[1]+1
            while (i < n - 1 && nums[i + 1] == nums[i] + 1) {
                i++; // i=1
            }
            // If start and current nums[i] are the same, it's a single number
            if (start == nums[i]) {
                list.add("" + start);
            } else {
                // Otherwise, it's a range from start to nums[i]
                list.add(start + "->" + nums[i]);
            }
            i++; // Move to the next number
        }

        return list;
    }
}
