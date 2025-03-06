package Dreamer.DSA.Intervals;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        System.out.println(Arrays.deepToString(FindIntervals(intervals)));
    }

    public static int[][] FindIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];

        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] newInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (newInterval[1] >= intervals[i][0]) {
                // Merge intervals
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                // Add merged interval to the list
                merged.add(newInterval);
                newInterval = intervals[i];
            }
        }
        // Add the last merged interval
        merged.add(newInterval);

        // Convert list to 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
