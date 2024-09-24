package LEETCODECHALLENGE;

import java.util.Arrays;
//Two Sum II

//there is an array ex: [2,7,11,15] and a target value= 9
// sum of two number should be target value
//return the index of those two numbers

//steps
//1. nums is already in sorted array - descending order
//take two pointers , left and right
//2. left=0, right= array.length-1
//3. if left+right index element > target
//   then right--
//  else if sum <target
//  then left++
//  sum= taget 
//4. return expected output as [ , ]

public class FOURTEEN {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        int target = 9;
        System.out.println(Arrays.toString(sumtwo(num, target)));

    }

    public static int[] sumtwo(int[] num, int target) {
        int left = 0;
        int result[] = new int[2];
        int right = num.length - 1;
        while (left < right) {
            int sum = num[left] + num[right];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;

            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;

    }

}
