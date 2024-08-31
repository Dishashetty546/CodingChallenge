package DailyCode;

public class SubIsland {
    public static boolean is_sub_Island;
    public static int count = 0;

    public static void dfs(int[][] grid1, int[][] grid2, int i, int j) {
        // Out of bounds or water cell, stop recursion
        if (i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0) {
            return;
        }

        // If the current cell in grid1 is water, it's not a valid sub-island
        if (grid1[i][j] != 1) {
            is_sub_Island = false;
        }

        // Mark the current cell in grid2 as visited
        grid2[i][j] = 0;

        // Explore all four directions (up, down, left, right)
        dfs(grid1, grid2, i + 1, j);
        dfs(grid1, grid2, i - 1, j);
        dfs(grid1, grid2, i, j + 1);
        dfs(grid1, grid2, i, j - 1);
    }

    public static void main(String[] args) {
        // Define the two grids
        int[][] grid1 = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 1 }
        };

        int[][] grid2 = {
                { 0, 0, 0, 1, 0 },
                { 1, 1, 1, 1, 1 },
                { 0, 1, 0, 1, 0 },
                { 0, 1, 0, 1, 0 },
                { 1, 0, 0, 0, 1 }
        };

        // Call the sub function and print the result
        System.out.println("Number of sub-islands: " + sub(grid1, grid2));
    }

    public static int sub(int[][] grid1, int[][] grid2) {
        count = 0;

        // Traverse through each cell in grid2
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                // Start DFS if we find an unvisited land cell in grid2
                if (grid2[i][j] == 1) {
                    is_sub_Island = true; // Assume it's a sub-island
                    dfs(grid1, grid2, i, j); // Perform DFS
                    if (is_sub_Island) { // Increment the count if it's a valid sub-island
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
