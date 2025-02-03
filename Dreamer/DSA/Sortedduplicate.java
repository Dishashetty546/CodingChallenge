package Dreamer.DSA;

public class Sortedduplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(sorted(arr));

    }

    public static int sorted(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
            }
            count++;

        }
        return count;

    }

}
