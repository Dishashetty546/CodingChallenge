package Algorithm;

import java.util.*;

public class Travelling {
    static int[] visited;
    static int[][] costmatrix;
    static int totalcost = 0, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cities :");
        n = sc.nextInt();
        System.out.println("Enter the cost matrix: ");
        costmatrix = new int[n][n];
        visited = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                costmatrix[i][j] = sc.nextInt();
            }
        }
        Arrays.fill(visited, 0);
        System.out.println("The path:");
        Visitedcities(0);
        System.out.println("Total cost :" + totalcost);

    }

    public static void Visitedcities(int currentcity) {
        visited[currentcity] = 1;
        System.out.print((currentcity + 1) + "-->");
        int nextCity = findnewcity(currentcity);
        if (nextCity == -1) {
            nextCity = 0;
            totalcost += costmatrix[currentcity][nextCity];
            System.out.println((nextCity + 1));
            return;
        }
        totalcost += costmatrix[currentcity][nextCity];
        Visitedcities(nextCity);
    }

    public static int findnewcity(int currentcity) {
        int mincost = Integer.MAX_VALUE;
        int nextCity = -1;
        for (int i = 0; i < n; i++) {
            if (costmatrix[currentcity][i] != 0 && visited[i] == 0 && costmatrix[currentcity][i] < mincost) {
                mincost = costmatrix[currentcity][i];
                nextCity = i;
            }

        }
        return nextCity;

    }

}