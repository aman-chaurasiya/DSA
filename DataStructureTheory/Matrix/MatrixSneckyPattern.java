package DataStructureTheory.Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSneckyPattern {
    public static void main(String[] args) {
        int [][]arr={{4,6,8},{27,28,40},{25,90,18}};

        for (int []a:arr
             ) {
            System.out.print(Arrays.toString(a));

        };
        System.out.println();
        snekyPrint(arr);
    }
   static void snekyPrint(int arr[][]){

        for (int i=0;i< arr.length;i++){
            if (i%2==0){
            for (int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
            }else{
                for (int j=arr[i].length-1;j>=0;j--)
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
