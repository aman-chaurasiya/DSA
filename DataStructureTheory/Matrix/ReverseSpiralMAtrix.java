package DataStructureTheory.Matrix;

import java.util.Arrays;

public class ReverseSpiralMAtrix {
    public static void main(String[] args) {
        int [][] a = {{1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}};
        int R=4,C=4;
        int[] spiral = reverseSpiral(R, C, a);
        System.out.println(Arrays.toString(spiral));

    }
    public static int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int minRow = 0, minCol = 0;
        int maxRow = R-1,maxCol = C-1;
        int N = R*C;
        int arr[] = new int[N];

        while(N > 0)
        {
            //Top Wall
            for(int i = minCol;i <= maxCol && N > 0;i++)
                arr[--N] = a[minRow][i];
            minRow++;

            //Right Wall
            for(int i = minRow;i <= maxRow && N > 0;i++)
                arr[--N] = a[i][maxCol];
            maxCol--;

            //Bottom Wall
            for(int i = maxCol;i >= minCol && N > 0;i--)
                arr[--N] = a[maxRow][i];
            maxRow--;

            //Left Wall
            for(int i = maxRow;i >= minRow && N > 0;i--)
                arr[--N] = a[i][minCol];
            minCol++;
        }
        return arr;
    }
}
