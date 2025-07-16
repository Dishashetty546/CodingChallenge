package Algorithm.BackTracking;

import java.util.Scanner;

public class Nqueenprob {
    static int[] x;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens:");
        int n = sc.nextInt();
        x = new int[n];
        Nqueen(0, n);
        if (count == 0) {
            System.out.println("No solution");
        } else {
            System.out.println("Number of solurions found:" + count);
        }
    }

    public static boolean Inplace(int k, int i) {
        for (int j = 0; j < k; j++) {
            if (x[j] == i || (Math.abs(x[j] - i) == Math.abs(j - k))) {
                return false;
            }
        }
        return true;
    }

    public static void Nqueen(int k, int n) {
        for (int i = 0; i < n; i++) {
            if (Inplace(k, i)) {
                x[k] = i;
                if (k == n - 1) {
                    count++;
                    System.out.println("Numbers:" + count);
                    printsolution(n);
                } else {
                    Nqueen(k + 1, n);
                }
            }
        }

    }

    public static void printsolution(int n) {
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < n; p++) {
                if (x[i] == p) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}