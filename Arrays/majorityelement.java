package Arrays;

//works only for only two types of digits are present in an array
public class majorityelement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 2, 2, 1, 1, 1 };
        System.out.println(majority(nums));

    }

    public static int majority(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
        return count;

    }

}
