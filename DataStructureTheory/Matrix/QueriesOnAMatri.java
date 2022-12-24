package DataStructureTheory.Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QueriesOnAMatri {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = {
                {4, 0, 5, 3},
                {0, 0, 3, 4},
                {1, 2, 1, 2},
                {1, 1, 2, 3},
                {0, 0, 3, 1},
                {1, 0, 2, 4}};
        int[][] ints = solveQueries(n, arr);
        for (int[] row:ints
             ) {
            System.out.println(Arrays.toString(row));

        }
    };


    public static int[][] solveQueries(int n, int[][] queries) {
        // Code here
        int[][] mat = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            int topLeft = queries[i][0], topRight = queries[i][1], botLeft = queries[i][2], botRight = queries[i][3];
            for (int idx = topLeft; idx <= botLeft; idx++) {
                mat[idx][topRight] += 1;
                if (botRight + 1 < n)
                    mat[idx][botRight + 1] += -1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 >= 0) {
                    mat[i][j] += mat[i][j - 1];
                }
            }
        }
        return mat;
    }

}



