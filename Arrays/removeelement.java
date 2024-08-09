package Arrays;

public class removeelement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 4, 5 };
        int val = 2;
        System.out.println(elementsremove(nums, val));

    }

    public static int elementsremove(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;

            }
        }
        return count;
    }

}
