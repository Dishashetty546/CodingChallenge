
//rotate image

//EX: 5 1 9 11
//    2 4 8 10
//    13 3 6 7
//    15 14 12 16

//O/P:
//   15 13 2 5
//   14 3 4 1
//   12 6 8 9
//   16 7 10 11

//BRUTE FORCE APPROACH
// simply pasting elements from the ex matrix in rotated manner by simply creating a new matrix
//image having a 10k elements, it will not be a efficient in terms of space and time
//hence not a feasible approach

//approach 1: using 4 way swap technique
//ex:  5   11
//     15  16

//o/p: 15  5
//     16  11
package Challenges.LEETCODECHALLENGE;

public class FOURTYTHREE {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };
        rotateimage(matrix);

        // Displaying rotated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rotateimage(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) { // Fixed the condition to j < n / 2
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
