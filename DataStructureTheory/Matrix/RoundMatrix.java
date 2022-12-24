package DataStructureTheory.Matrix;

public class RoundMatrix {
    public static void main(String[] args) {
        roundMatrix(4, 4, 3);
    }

    private static void roundMatrix(int r, int c, int a) {
        int[][] mat = new int[r][c];
        int number = 1;
        for (int i = a - 1; i < c; i++)
            mat[0][i] = number;

        for (int i = 1; i < r; i++)
            mat[i][c - 1] = number;

        for (int i = c - 2; i >= 0; i--)
            mat[r - 1][i] = number;

        for (int i = r - 2; i > 0; i--)
            mat[i][0] = number;

        if (a != 1) {
            for (int i = 0; i < a - 1; i++) {
                mat[0][i] = number;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0)
                    System.out.print(mat[i][j] + " ");
                else if (i == r - 1)
                    System.out.print(mat[i][j] + " ");
                else if (j == 0)
                    System.out.print(mat[i][j] + " ");
                else if (j == c - 1)
                    System.out.print(mat[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}



