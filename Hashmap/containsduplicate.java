import java.util.Map;
import java.util.HashMap;

public class containsduplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(duplicate(nums, k));

    }

    public static boolean duplicate(int[] nums, int k) {
        if (k == 0)
            return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int val = nums[i];
            if (map.containsKey(val) && (i - map.get(val) <= k))
                return true;
            map.put(val, i);

        }
        return false;

    }
}
