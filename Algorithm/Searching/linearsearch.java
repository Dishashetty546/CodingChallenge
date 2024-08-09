package Algorithm.Searching;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8 };
        int key = 5;
        System.out.println(search(arr, key));
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;

    }

}
