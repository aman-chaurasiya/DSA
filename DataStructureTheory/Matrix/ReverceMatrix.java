package DataStructureTheory.Matrix;

import java.util.Arrays;

public class ReverceMatrix {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 7, 4},
                {6, 8, 9, 7}};
        int n=arr.length;
        reverceMatrix(arr,n);
        for (int[] ar:arr
             ) {
            System.out.println(Arrays.toString(ar));
        }

    }
   static void  reverceMatrix(int arr[][],int n){
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while (low<high){
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }

    }
}
