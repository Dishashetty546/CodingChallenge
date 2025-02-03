package Dreamer.DSA;

public class Removelement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2 };
        int val = 2;
        System.out.println(remove(arr, val));

    }

    public static int remove(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;

            }

        }
        return count;

    }

}
