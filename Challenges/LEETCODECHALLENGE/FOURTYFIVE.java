package Challenges.LEETCODECHALLENGE;

//find next greater element 1
//nums 1 = [4,1,2]
//nums 2  = [1,3,4,2]

//check fr element in num1, search fr that element in num2, if it exists, then check if elements greater then that exists, if yes then write that element over there, else -1
//o/p: [-1.3.-1]

//brute force approach
//when pick an element, then search for that particular element on that array itself, then write result on another array that we created
//its not an optimized approach
// import java.util.Arrays;
// public class FOURTYFIVE {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         System.out.println(Arrays.toString(greater(arr)));

//     }

//     public static int[] greater(int[] arr) {
//         int n = arr.length;
//         int[] result = new int[n];
//         for (int i = 0; i < n; i++) {
//             result[i] = -1;

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] > arr[i]) {
//                     result[i] = arr[j];
//                     break;

//                 }
//             }
//         }
//         return result;

//     }

// }

//approach 1
//usage of stack
//iterating thhrough array from back side of an array
//storing these elements on to the stack
import java.util.Stack;
import java.util.Arrays;

public class FOURTYFIVE {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(efficent(arr)));

    }

    public static int[] efficent(int[] arr) {
        // created a stack to store elements by iteratig from end of the array
        Stack<Integer> stacks = new Stack<>();
        // an extra space of array to store o/p
        int[] nextgreater = new int[arr.length];
        // pick an element in each iterate
        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];
            // check if stack is empty
            if (stacks.isEmpty()) {
                // if yes,push it onto stack
                stacks.push(arr[i]);
                // consider first element on new array as -1
                nextgreater[i] = -1;
                continue;
            }
            // else, peek an elemet and check for greater then this present element
            if (stacks.peek() > element) {
                stacks.push(element);
                // if yes, peek that element from stack and add onto result array
                nextgreater[i] = stacks.peek();
                continue;
            }
            while (stacks.peek() <= element) {
                stacks.pop();
            }
            if (stacks.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = stacks.peek();
            }
            stacks.push(element);

        }
        return nextgreater;

    }

}
