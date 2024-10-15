package LEETCODECHALLENGE;//* 

//REMOVE ELEMENT FROM THE ARRAY
//approach:
//using array method
//in array, we cant remove elements directly,
//so we , take element in last index, then decrement the len 
public class TWO {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4 };
        int val = 2;
        System.out.println(remove(nums, val));
    }

    public static int remove(int[] nums, int val) {
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
