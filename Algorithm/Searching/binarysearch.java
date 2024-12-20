package Algorithm.Searching;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2 };
        int key = 5;
        System.out.println((searches(arr, key)));
    }

    public static int searches(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (arr[mid] < key) {

                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        return -1;
    }

}
