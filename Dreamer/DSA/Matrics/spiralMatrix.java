package Dreamer.DSA.Matrics;

import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiral(matrix));

    }

    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> adding = new ArrayList<>();
        int rb = 0;
        int cb = 0;
        int re = matrix.length - 1;
        int ce = matrix[0].length - 1;
        while (rb <= re && cb <= ce) {
            for (int i = cb; i <= ce; i++) {
                adding.add(matrix[rb][i]);

            }
            rb++;
            for (int j = rb; j <= re; j++) {
                adding.add(matrix[j][ce]);

            }
            ce--;
            for (int k = ce; k >= cb; k--) {
                adding.add(matrix[re][k]);
            }
            re--;
            for (int p = re; p >= rb; p--) {
                adding.add(matrix[p][cb]);
            }
            cb++;

        }
        return adding;

    }

}
