package Dreamer.DSARevise;

import java.util.*;

//Find first largest and second largest element 
//ex: [3,4,5,2,1,4]
//o/p: [5,4]

//approach
//create 2 variables m1 and m2
//by default, compare 1st and second element, largest take as m1, small among two is m2

// then start iterating through the array, from 2nd index
//compare 2nd index element with m1,
//if it is larger them m1, then we need to change m1
//but m1 is bigger then m2, therefor
//m2 will be replaced by m1 element , m1= nums[i]
//if m1 is less then nums[i], then replace with nums[i]
//then return m1,m2

//complexity
//space: O(n), for loop iterate n times
//time: O(n)
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(Largest(nums)));
    }

    public static int[] Largest(int[] nums) {
        int m1, m2;
        if (nums[0] > nums[1]) {
            m1 = nums[0];
            m2 = nums[1];

        } else {
            m2 = nums[0];
            m1 = nums[1];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return new int[] { m1, m2 };
    }

}
