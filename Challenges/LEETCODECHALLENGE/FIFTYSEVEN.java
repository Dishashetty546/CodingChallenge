package Challenges.LEETCODECHALLENGE;

// MINIMUM LOSS

// QUES : YOU'LL BUY A HOUSE AND YOU HAVE STATISTUCS OF WORTH OF THAT PROPERTY
// OVER YEARS, TASK IS TO FIND THE MINIMUM LOSS OUT OF ALL

// EX: [20,15,8,2,12]
// O/P: 3 , but at 15 and sell at 12
// brute force approach
// public class FIFTYSEVEN {
// public static void main(String[] args) {
// int[] arr = { 20, 15, 8, 2, 12 };
// System.out.println(linkedListtwo(arr));

// }

// public static int linkedListtwo(int[] arr) {
// int minimum = Integer.MAX_VALUE;
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (arr[i] > arr[j]) {
// int loss = arr[i] - arr[j];
// if (loss < minimum) {
// minimum = loss;
// }
// }
// }
// }
// return minimum;

// }

// }

// time complexity = o(n^2)
import java.util.HashMap;
import java.util.Map;

// approach 2:
public class FIFTYSEVEN {
    public static void main(String[] args) {

    }

    public static void minimun(int[] arr) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            index.put(arr.length, i);
        }
    }
}