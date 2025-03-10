package Dreamer.DSA.TwoPointer;

import java.util.Scanner;
import java.util.*;

public class ClosedPrimeInTheRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close(); // Close Scanner
        System.out.println(Arrays.toString(closetPrime(l, r)));

    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false; // Prime numbers start from 2

        for (int i = 2; i * i <= n; i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int[] closetPrime(int l, int r) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = l; i <= r; i++) { // Include 'r' in the range
            if (isPrime(i)) {
                primes.add(i);

            }
        }
        int m = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (m > diff) {
                m = diff;
                num1 = primes.get(i);
                num2 = primes.get(i - 1);

            }
        }
        return new int[] { num2, num1 };

    }
}
