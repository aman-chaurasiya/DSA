package DataStructureTheory.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

       int  arr[] = { 4, 1, 3, 9, 7};
        int low=0;
        int high= arr.length-1;
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);

        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j){
            while(i<=j && arr[i]<=pivot)
                i++;

            while(arr[j]>pivot)
                j--;

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}
