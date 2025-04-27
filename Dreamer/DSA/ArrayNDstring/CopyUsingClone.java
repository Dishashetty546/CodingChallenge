package Dreamer.DSA.ArrayNDstring;

import java.util.*;

class CopyUsingClone {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.print(Arrays.toString(copying(arr)));

    }

    public static int[] copying(int[] arr) {

        int[] copy = arr.clone();
        return copy;

    }
}