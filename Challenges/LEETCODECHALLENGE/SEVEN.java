package LEETCODECHALLENGE;
//product of elements in an array except the self //* 

//aproach 1: dividing each elemet by itself

//approach 2: without using division method
// left product and right product calculation
//[ 1,2,3,4]-->array
// left product ->[1,1,2,6]
//right product ->[24,12,8,1]
//result= [24,12,16,6]
import java.util.Arrays;

public class SEVEN {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(element(nums)));

    }

    public static int[] element(int[] nums) {
        int leftproduct[] = new int[nums.length];
        int rightproduct[] = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            leftproduct[i] = temp;
            temp *= nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            rightproduct[i] = temp;
            temp *= nums[i];
        }
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftproduct[i] * rightproduct[i];
        }
        return result;
    }

}