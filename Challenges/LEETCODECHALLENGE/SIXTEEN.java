package LEETCODECHALLENGE;
//SUM

//returning
//steps
//check if array size is less then 3, then return a empty list of elements
//step 1: sorting the array i ascending order
//step 2: take 3 pointers i=0,j=i+1,k=nums.length-1
//step 3: take var sum=0, sum= nums[i]+nums[j]+nums[k]
//step 4: take conditions , if(sum<0), j++
//else if sum>0, k--
//else sum==0, i++ and k--

//step 5: consider a set, add array when , sum==0
import java.util.*;

public class SIXTEEN {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(sum(nums));
    }

    public static List<List<Integer>> sum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int sum = 0;
        Arrays.sort(nums); // Step 1: Sort the array in ascending order
        for (int i = 0; i < nums.length - 2; i++) { // Ensure we have at least 3 elements
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k]; // Step 3: Calculate the sum
                if (sum == 0) { // If sum is zero, add the triplet to the result
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--; // If sum is greater than zero, move the right pointer left
                } else {
                    j++; // If sum is less than zero, move the left pointer right
                }
            }
        }
        return new ArrayList<>(result); // Convert the set to a list and return it
    }
}
