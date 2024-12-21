// package LEETCODECHALLENGE;

// import java.util.Map;
// import java.util.HashMap;
// import java.util.Arrays;

// TWO SUM
// I/P:[2,7,11,15]
// TARGET:9
// O/P:[0,1]
// APPROACH 1: brute force approach-by writting all the possible approaches as
// possible, how many combinations we can try? it isnt an Efficient approach
// APPROCH 2: IF WE ARE TRYING TO SEARCH SOMETHING, first sort array first
// public class THIRTYSIX {
// public static void main(String[] args) {
// int[] num = { 1, 2, 3, 4 };
// int target = 7;
// System.out.println(Arrays.toString(AONE(num, target)));

// }

// public static int[] AONE(int[] num, int target) {
// for (int i = 0; i < num.length; i++) {
// for (int j = i + 1; j < num.length; j++) {
// if (num[j] == target - num[i]) {
// return new int[] { i, j };
// }
// }
// }
// return null;
// }
// }

// APPROACH 3: USAGE OF HASHTABLE TO STORE ALL THE KEY VALUES, COZ IT TAKES 0(1)
// time complexity in hashtable
// public class THIRTYSIX {
// public static void main(String[] args) {
// int[] num = { 16, 4, 23, 8, 15, 42, 1, 2 };
// int target = 19;
// System.out.println(Arrays.toString(Atwo(num, target)));

// }

// public static int[] Atwo(int[] num, int target) {
// Map<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < num.length; i++) {
// int complement = num[i] - target;
// if (map.containsKey(complement)) {
// return new int[] { map.get(complement), i };

// }
// map.put(num[i], 1);
// }
// throw new IllegalArgumentException("no");

// }

// }
