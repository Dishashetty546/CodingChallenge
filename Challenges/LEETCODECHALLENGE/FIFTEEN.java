package LEETCODECHALLENGE;

//Container with most water
// given an array 
//that shows height of rods in tub of water
//task is to select 2 rods that can make more water in a tub
//EX:  rod heights: {1,8,6,2,5,4,8,3,7}
//
//steps:
//step 1: take 2 pointers left and right
//left=0, right= array.length-1
//step 2: calculate current area=  min(height[left],height[right]) * (rigth_indx - left_index)
//keep on updating max area and current area
//step 3: give if statments accordingly
//step 4: return max_area

public class FIFTEEN {
    public static void main(String[] args) {
        int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(water(nums));

    }

    public static int water(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int max_area = 0;
        int current_area = 0;
        while (left < right) {
            current_area = (Math.min(nums[left], nums[right])) * (right - left);
            max_area = Math.max(current_area, max_area);
            if (nums[left] <= nums[right]) {
                left++;
            } else if (nums[left] >= nums[right]) {
                right--;
            }

        }
        return max_area;

    }
}
