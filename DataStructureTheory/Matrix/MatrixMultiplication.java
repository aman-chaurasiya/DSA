package DataStructureTheory.Matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 5},
                {3, 4, 6},
                {3, 4, 6}};
        int b[][] = {{1, 2},
                      {1, 3},
                     {1, 3}};
        matrixMultiplication(a, b);
    }

    static void matrixMultiplication(int a[][], int b[][]) {
        int n1 = a.length;
        int n2 = b.length;
        int m1 = a[0].length;
        int m2 = b[0].length;

        if (m1 != n2) {
            System.out.println("multiplication not possible");
            return;
        }
        int c[][] = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < n2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++)
                System.out.print(c[i][j] + " ");

            System.out.println();
        }


    }
}
