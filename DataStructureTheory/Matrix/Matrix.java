package DataStructureTheory.Matrix;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println(Arrays.toString(new String[]{Arrays.toString(arr)}));
int k=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               arr[i][j]=k;
               k++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
