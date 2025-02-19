
// spiral matrix

// ex: 1 2 3 4 5 6
// 7 8 9 0 1 2
// 3 4 5 6 7 8
// 9 0 1 2 3 4
// 5 6 7 8 9 0
// 1 2 3 4 5 6

// 0/p: 1 2 3 4 5 6 2 8 4 0 6 5 4 3 2 1 5 9 3 7 8 9 0 1 7 3 9 8 7 6 0 4....
package Challenges.LEETCODECHALLENGE;

import java.util.ArrayList;
import java.util.List;

public class FOURTYFOUR {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 0, 1, 2 },
                { 3, 4, 5, 6, 7, 8 },
                { 9, 0, 1, 2, 3, 4 },
                { 5, 6, 7, 8, 9, 0 },
                { 1, 2, 3, 4, 5, 6 }
        };
        System.out.println(spiral(matrix));
    }

    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse from left to right
            for (int j = colBegin; j <= colEnd; j++) {
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // Traverse downwards
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse from right to left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    result.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            // Traverse upwards
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }

        return result;
    }
}
