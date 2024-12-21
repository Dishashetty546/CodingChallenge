package LEETCODECHALLENGE;

//minimum size subarray sum
//ex: taget: 7, nums = {2,3,1,2,4,3}
//finding minimum values to get sum as 7
//output- 2 ---> that is [4,3]

//steps
//step 1:take 2 pointer l and r
//step 2:if nums[l]+nums[r] <= target, then r++
//loop continues
//else if nums[l]+nums[r]>=target, then l++
//else nums[l]+nums[r]==target
//then, right-left = minlength
//

public class EIGTEEN {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minimum(nums, target));
    }

    public static int minimum(int[] nums, int target) {
        int minlen = Integer.MAX_VALUE; // Initialize to a large value
        int sum = 0; // Running sum
        int l = 0; // Left pointer

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r]; // Add nums[r] to the current sum

            // Shrink the window while sum is greater than or equal to target
            while (sum >= target) {
                minlen = Math.min(minlen, r - l + 1); // Update minlen if current subarray is smaller
                sum -= nums[l]; // Remove the leftmost element from the sum
                l++; // Move the left pointer to the right
            }
        }

        // If no valid subarray is found, return 0
        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}
