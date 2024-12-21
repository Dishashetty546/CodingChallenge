package linkedlist;

public class removeelements {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 4, 3, 2 };
        int val = 3;
        System.out.println(elements(nums, val));
    }

    public static int elements(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];
                len--;
            } else {
                i++;
            }

        }
        return len;

    }
}
