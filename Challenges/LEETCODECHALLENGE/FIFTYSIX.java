package Challenges.LEETCODECHALLENGE;

//duplicates from an array with 0 extra space consumption
//
//ex: 12342131
//o/p:123
// import java.util.HashSet;

// //using hashset
// public class FIFTYSIX {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 4, 5, 1, 2 };
//         System.out.println(duplicate(nums));

//     }

//     public static HashSet duplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> element = new HashSet<>();
//         for (int arr : nums) {
//             if (!set.add(arr)) {
//                 element.add(arr);
//             }

//         }
//         return element;
//     }

// }

//Time complexity: o(n)
//space complexity:o(n)

//without using extra space
import java.util.ArrayList;
import java.util.List;

//approach 2: for every index go on checking and mark it as negatuve,
//while checking if eleement is already negative, add it to result set
public class FIFTYSIX {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 1, 2 };
        System.out.println(element(nums));

    }

    public static List<Integer> element(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i] - 1);
            if (nums[index] < 0) {
                result.add(index + 1);

                nums[index] = nums[index] + -1;
            }

        }
        return result;
    }
}
