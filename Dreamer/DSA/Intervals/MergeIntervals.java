package Dreamer.DSA.Intervals;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] interval = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        System.out.println(FindIntervals(interval));

    }

    public static void FindIntervals(int[][] intervals) {
        Arrays.sort(intervals);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

    }

}
