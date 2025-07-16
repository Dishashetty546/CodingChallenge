package Dreamer.DSARevise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class LargestNumberThatCanBeFormedFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println((Largest(nums)));
    }

    public static String Largest(int[] nums) {
        int n = nums.length;
        String e[] = new String[n];
        for (int i = 0; i < n; i++) {
            e[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(e, new Comparator<String>() {
            public int compare(String a, String b) {
                String f = a + b;
                String s = b + a;
                return s.compareTo(f);
            }
        });
        String res = "";
        for (String val : e) {
            res = res + val;

        }
        return res;
    }

}
