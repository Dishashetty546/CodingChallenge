package LEETCODECHALLENGE; //* 

//roate elements k times
//appraoch -
//first reverse index 0 to n-1
//then reverse from 0 to k-1
//then reverse from k to n-1
//use normal reverse logic
import java.util.*;

public class FOUR {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6 };
        int k = 2;
        System.out.println(Arrays.toString(rotate(nums, k)));

    }

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        reversed(nums, 0, n - 1);
        reversed(nums, 0, k - 1);
        reversed(nums, k, n - 1);
        return nums;

    }

    public static void reversed(int[] nums, int left, int right) {
        int n = nums.length;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}
