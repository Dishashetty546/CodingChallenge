package Dreamer.DSA.Matrics;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class setZerosInMatrix {
    public static void main(String[] args) {
        int[][] nums = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        System.out.println(Arrays.deepToString(setZeroes(nums)));

    }

    public static int[][] setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> rowset = new HashSet<>();
        Set<Integer> colset = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowset.contains(i) || colset.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;

    }

}
