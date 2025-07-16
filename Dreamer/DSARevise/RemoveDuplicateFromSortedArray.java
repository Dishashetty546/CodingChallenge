package Dreamer.DSARevise;
//remove duplicate from sorted array

//approach
//1. use pointer to keep track of the last unique element
//2. iterate through the array and check if the current element if diff
//3.if it is add it to the array and increment the pointer
//4. return the pointe as the length of the array

//complexity
//time: O(n)
//space: O(1)
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr) {
        int count = 1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;

    }

}
