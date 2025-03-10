package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class FindMissingAndReapetedValues {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 3 },
                { 2, 2 }
        };
        System.out.print(Arrays.toString(FindrepeatAndMiss(grid)));

    }

    public static int[] FindrepeatAndMiss(int[][] grid) {
        int n = grid.length * grid[0].length;
        int[] count = new int[n + 1];
        int missing = -1;
        int repeat = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                count[grid[i][j]]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeat = i;

            } else if (count[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeat, missing };

    }
}
