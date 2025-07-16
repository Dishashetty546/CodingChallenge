package Algorithm.CN;

import java.util.Arrays;

public class bell {
    public final static int INF = 999;

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, INF },
                { INF, 0, 4 },
                { INF, INF, 0 }
        };
        int src = 0;
        BellmanFord(graph, src);
    }

    public static void BellmanFord(int[][] graph, int src) {
        int v = graph.length;
        int[] dist = new int[v];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        for (int k = 0; k < v - 1; ++k) {
            for (int i = 0; i < v; ++i) {
                for (int j = 0; j < v; ++j) {
                    if (graph[i][j] != INF && dist[i] != INF && dist[i] + graph[i][j] < dist[j]) {
                        dist[j] = dist[i] + graph[i][j];
                    }

                }

            }
        }
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < v; j++) {
                if (graph[i][j] != INF && dist[i] != INF && dist[i] + graph[i][j] < dist[j]) {
                    System.out.println("found negative verticces");
                    return;
                }

            }

        }
        Arrdisplay(dist);

    }

    public static void Arrdisplay(int[] dist) {
        int v = dist.length;
        System.out.println("The distance from source: ");
        for (int i = 0; i < v; i++) {
            if (dist[i] == INF) {
                System.out.println("vertices" + i + ": " + INF);
            }
            System.out.println("Vertex " + i + ":" + dist[i]);
        }
    }
}
