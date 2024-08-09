package Algorithm.shortestpath;

import java.util.*;

public class dijkstra_priority {
    static int[][] graph;
    public static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows/columns:");
        int n = sc.nextInt();
        graph = new int[n][n];
        System.out.println("Enter the adjacency matrix (enter 0 for no direct path):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 0 && i != j) {
                    graph[i][j] = INF;
                }
            }
        }
        int source = 0;
        dijkstra(source, n);
    }

    public static void dijkstra(int source, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> dist[a]));
        pq.offer(source);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (int v = 0; v < n; v++) {
                int newDist = dist[u] + graph[u][v];
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(v);
                }
            }
        }

        System.out.println("Distance from source vertex " + source + ":");
        for (int i = 0; i < n; i++) {
            if (dist[i] == INF) {
                System.out.println("vertex " + i + ": INF");
            } else {
                System.out.println("vertex " + i + ": " + dist[i]);
            }
        }
    }
}
