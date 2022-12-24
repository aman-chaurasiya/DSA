package DataStructureTheory.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] arr={10,20,30,20,10,20,8,7,6};
        int n=arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int [] arr,int n){
        for (int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

}
