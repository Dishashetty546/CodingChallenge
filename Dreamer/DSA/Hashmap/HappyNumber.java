package Dreamer.DSA.Hashmap;

import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(happy(n));

    }

    public static boolean happy(int n) {
        Set<Integer> maps = new HashSet<>();
        while (!maps.contains(n)) {
            int sum = 0;
            maps.add(n);
            while (n != 0) {
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;

    }

}
