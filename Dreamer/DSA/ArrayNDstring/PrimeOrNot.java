package Dreamer.DSA.ArrayNDstring;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(IsPrime(n) ? "Yes" : "No");

    }

    public static boolean IsPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;

            }

        }
        return count == 2;

    }

}