package DataStructureQuestion.ArraysQuestion;

import java.util.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,9,8,7,6,4};
        int n=arr.length;
        int[] swap = swap(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] swap(int arr[],int n){
        for (int i=0;i<n-1;i+=2){
            arr[i]=arr[i]+arr[i+1];
            arr[i+1]=arr[i]-arr[i+1];
            arr[i]=arr[i]-arr[i+1];
        }
        return arr;
    }
}
