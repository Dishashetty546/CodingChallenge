package Algorithm.shortestpath;

public class warshall {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 1, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };
        int[][] closure = warshalls(graph);
        System.out.println("Transitive closure matrix:");
        printSolution(closure);
    }

    public static int[][] warshalls(int graph[][]) {
        int v = graph.length;
        int[][] closure = new int[v][v];
        int i, j, k;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                closure[i][j] = graph[i][j];
            }
        }
        for (k = 0; k < v; k++) {
            for (i = 0; i < v; i++) {
                for (j = 0; j < v; j++) {
                    if (closure[i][j] != 0) {
                        // If there's already a path from i to j, keep it
                        closure[i][j] = 1;
                    } else if (closure[i][k] != 0 && closure[k][j] != 0) {
                        // If there's a path from i to k and k to j, then there's a path from i to j
                        closure[i][j] = 1;
                    }
                }
            }
        }
        return closure;
    }

    public static void printSolution(int[][] dist) {
        int v = dist.length;
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < v; ++j) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
