package LEETCODECHALLENGE;

//rotate the matrix in 90 degree
//ex: {1,2,3}
//    {4,5,6}
//    {7,8,9}
//output: {7,4,1}
//        {8,5,2}
//        {9,6,3}

//steps:
//*first do transpose of matrix:{1,4,7}
//                              {2,5,8}
//                              {3,6,9}
//*then do reverse of matrix:{7,4,1}
//                           {8,5,2}
//                           {9,6,3}

//1. transpose: 2 pointers i,j --> i fr rows nd j fr col
//2. reverse rd array
//3. to print 2D Arrsy make use of Arrays.deepToString();
import java.util.Arrays;

public class TWENTY {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transposeMatrix(matrix);

        System.out.println(Arrays.deepToString(reverseMatrix(matrix)));
    }

    public static void transposeMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] reverseMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;

    }

}
