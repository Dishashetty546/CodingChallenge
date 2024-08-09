package Algorithm.shortestpath;

import java.util.Arrays;

public class Bellmanford {
    public static final int INF = 999; // A large value to represent infinity

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 6, 5, INF, INF },
                { 6, 0, 2, 1, INF },
                { 5, 2, 0, 4, 3 },
                { INF, -1, 4, 0, 3 },
                { INF, INF, 3, 3, 0 }
        };
        int src = 0; // Source vertex is 0 (first vertex, 0-based index)
        bellmanFord(graph, src);
    }

    public static void bellmanFord(int[][] graph, int src) {
        int v = graph.length;
        int[] dist = new int[v];

        // Step 1: Initialize distances from src to all other vertices as INFINITE
        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Step 2: Relax all edges |V| - 1 times
        for (int k = 0; k < v - 1; ++k) {
            for (int i = 0; i < v; ++i) {
                for (int j = 0; j < v; ++j) {
                    if (graph[i][j] != INF && dist[i] != INF && dist[i] + graph[i][j] < dist[j]) {
                        dist[j] = dist[i] + graph[i][j];
                    }
                }
            }
        }

        // Step 3: Check for negative-weight cycles
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < v; ++j) {
                if (graph[i][j] != INF && dist[i] != INF && dist[i] + graph[i][j] < dist[j]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }

        // Print the calculated shortest distances
        printArr(dist);
    }

    public static void printArr(int dist[]) {
        System.out.println("Vertex distance from the source:");
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == INF) {
                System.out.println("Vertex " + i + ": INF");
            } else {
                System.out.println("Vertex " + i + ": " + dist[i]);
            }
        }
    }
}
