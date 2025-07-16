package Dreamer.DSARevise;
//product of array except self

//array nums given ex: {1,2,3,4}
//o/p: {24,12,8,6}

//approach:
//1. create two arrays left and right
//2. left[i] is product of all elements to the left of i
//3. right[i] is product of all elements to the right of i
//4. ans[i]=left[i]*right[i]
//5. return ans

//ex:
//nums={1,2,3,4}
//left={1,1,2,6}
//right={24,12,4,1}
//ans={24,12,8,6}

//complexity:
//time: O(n)
//space: O(n)
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(product(num)));

    }

    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];

        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }

}
