package Algorithm.minimumspanning;

import java.util.*;

public class prims {
    static int[][] graph;
    public static final int INF = 999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes in a graph:");
        int n = sc.nextInt();
        System.out.println("Enter the graph elements:");
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 0 && i != j) {
                    graph[i][j] = INF;
                }
            }
        }
        int[] visited = new int[n];
        Arrays.fill(visited, 0);
        int total = 0;
        visited[0] = 1;
        for (int count = 0; count < n - 1; count++) {
            int min = 999;
            int u = 0;
            int v = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 1) {
                    for (int j = 0; j < n; j++) {
                        if (visited[j] == 0 && graph[i][j] < min) {
                            min = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }
            visited[v] = 1;
            total += min;
            System.out.println("Edges" + u + "-->" + v + ":" + min);
        }
        System.out.println("Total :" + total);

    }
}
