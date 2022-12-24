package DataStructureTheory.Matrix;

import java.util.Arrays;

public class Rotate90Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 7, 4},
                {6,8,9,7}};
        for (int[] ar:arr
        ) {
            System.out.println(Arrays.toString(ar));
        }
        int n=arr.length;
       // rotatematrixbest(arr,n);
        for (int[] ar:arr
        ) {
            System.out.println(Arrays.toString(ar));
        }
        System.out.println();
        rotatematrixNaive(arr,n);
        for (int[] ar:arr
        ) {
            System.out.println(Arrays.toString(ar));
        }

    }
    static void rotatematrixbest(int arr[][], int n){
        TransposeMatrix.transposeBest(arr,n);
        ReverceMatrix.reverceMatrix(arr,n);

    }
  static void  rotatematrixNaive(int arr[][],int n){
        int temp[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                temp[n-j-1][i]=arr[i][j];
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=temp[i][j];
            }
        }

    }
}
