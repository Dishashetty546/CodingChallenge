package LEETCODECHALLENGE;

import java.util.ArrayList;
//find the disappering numbers
//ex: [4,3,2,7,8,2,3,1]  size=8
//if size is 8, then o/p should be [ 1,2,3,4,5,6,7,8]
//but here 7 and 8 are missing, so [6,5] are missinh
//o/p: [5,6]
import java.util.List;

//Brute force approach : iiterating through array for each element , like in search of 1 , iterate through array, then in search of 2..... - then print disappearing-this is not time efficient
//approach 1: sort the array

public class THIRTYEIGHT {
    public static void main(String[] args) {
        int[] num = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Example input with size 8
        System.out.println(disappearing(num)); // Output should be [5, 6]
    }

    public static List<Integer> disappearing(int[] num) {
        List<Integer> result = new ArrayList<>();

        // Mark the presence of each number in the array
        for (int i = 0; i < num.length; i++) {
            int idx = Math.abs(num[i]) - 1; // Calculate index based on value
            if (num[idx] > 0) {
                num[idx] = -num[idx]; // Negate only if it's positive (mark as visited)
            }
        }

        // Find missing numbers (which correspond to positive values)
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) { // If positive, that index + 1 is missing
                result.add(i + 1);
            }
        }

        return result;
    }
}