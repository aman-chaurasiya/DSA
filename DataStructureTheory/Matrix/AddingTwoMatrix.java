package DataStructureTheory.Matrix;

import java.util.Arrays;

public class AddingTwoMatrix {
    public static void main(String[] args) {
        int a[][]={{2, 3, 4},
                {3, 5, 6},
                {3, 7, 5}};
        int b[][]={{5, 4, 3},
                {6, 5, 4},
                {6, 5, 4}};
        int[][] addMatrix = addMatrix(a, b);
        for (int[] mat:addMatrix
             ) {
            System.out.println(Arrays.toString(mat));
            
        };
    }

   static int[][] addMatrix(int a[][],int b[][]){
        int n=a.length;
        int m=a[0].length;
        int n1=b.length;
        int m1=b[0].length;


        int arr[][]=new int[n][m];
        if (n!=n1 || m!=m1){
            int arr1[][]=new int[1][1];
            arr[0][0]=-1;
            return arr1;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=a[i][j]+b[i][j];
            }
        }
        return arr;
    }
}
