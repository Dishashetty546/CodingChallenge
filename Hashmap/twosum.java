import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int key = 3;
        System.out.println(Arrays.toString(sum(nums, key)));

    }

    public static int[] sum(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = key - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };

            }
            map.put(nums[i], i);
        }
        return null;

    }

}