package Algorithm.Knapsack_problem;

import java.util.*;

public class dynamic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits:");
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight and values for -" + (i + 1) + ":");
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        System.out.println("Enter the capacity :");
        int cap = sc.nextInt();
        int maxvalue = knapsack(weight, value, cap);
        System.out.println("Maxvalue:" + maxvalue);
    }

    public static int knapsack(int[] weight, int[] value, int cap) {
        int n = value.length;
        int[][] dist = new int[n + 1][cap + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= cap; w++) {
                if (weight[i - 1] <= w) {
                    dist[i][w] = Math.max(dist[i - 1][w], dist[i - 1][w - weight[i - 1]] + value[i - 1]);
                } else {
                    dist[i][w] = dist[i - 1][w];
                }
            }
        }
        displaymatrix(n, dist, cap);
        return dist[n][cap];
    }

    public static void displaymatrix(int n, int[][] dist, int cap) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= cap; j++) {

                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
