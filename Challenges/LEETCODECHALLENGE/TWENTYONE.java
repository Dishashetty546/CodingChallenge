package Challenges.LEETCODECHALLENGE;

//SET MATRIX ZERO
//ex: {1,1,1}
//    {1,0,1}
//    {1,1,1}
//output: {1,0,1}
//        {0,0,0}
//        {1,0,1}
//steps:
//step 1:
import java.util.*;

public class TWENTYONE {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(Arrays.deepToString(setZeros(matrix)));

    }

    public static int[][] setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix.length;
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
