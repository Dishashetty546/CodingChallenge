package Challenges.LEETCODECHALLENGE; //8

import java.util.ArrayList;
import java.util.Map;

import java.util.Arrays;
//Missing numbers
//print missing no. as o/p
//in sorted order
//EX: 7,25,4,6,3,5,3
//: 7,2,5,3,5,3
//O/P: 4 , 6

//approach 1: each elemet in array second , search for the same in array first, iterate throug the array every time - this causes additional time
//approach 2: using TreeMap- in treemap, elements are stored using its frequency, speciality is that it is stored in sorted order
public class THIRTYFIVE {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 5, 7, 8 };
        System.out.println(Arrays.toString(numbers(arr1, arr2)));

    }

    public static int[] numbers(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (tree.containsKey(arr1)) {
                tree.put(arr1, tree.get(arr1) + 1);
            } else {
                tree.put(arr1, 1);
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            if (tree.containsKey(arr2[i])) {
                int count = tree.get(arr2[i]);
                if (count == 1) {
                    tree.remove(arr2[i]);

                } else {
                    tree.put(arr2[i], count - 1);
                }
            }

        }
        final ArrayList<Integer> missingNumbers = new ArrayList<>(tree.keySet());

        // Convert the result to an int[] array
        int[] result = new int[missingNumbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = missingNumbers.get(i);
        }

        return result;

    }
}
