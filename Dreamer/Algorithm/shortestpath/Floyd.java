package Algorithm.shortestpath;

import java.util.*;

public class Floyd {
    public static int[][] graph;
    public static final int INF = 999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter/ fill the graph");
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 0 && i != j) {
                    graph[i][j] = INF;
                }
            }
        }
        System.out.println("Shortest path :");
        int[][] Shortestpath = floysalgo(graph);
        printSolution(Shortestpath);

    }

    public static int[][] floysalgo(int[][] graph) {
        int n = graph.length;
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = graph[i][j];
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        return dist;
    }

    public static void printSolution(int[][] dist) {
        int v = dist.length;
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < v; ++j) {
                if (dist[i][j] == INF) {
                    System.out.print(INF);
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
