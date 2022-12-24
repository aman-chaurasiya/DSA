package DataStructureTheory.Sorting;

import java.util.Arrays;

public class MergeTwosortedArray {
    public static void main(String[] args) {
        int arr2[] = {1, 5, 9, 10, 12};

        int arr[] = {2, 3};
        int n = arr.length;
        int m = arr2.length;
      //  int[] sortedArray = mergeTwoArray(arr, arr2, n, m);
       // System.out.println(Arrays.toString(sortedArray));
        mergesort(arr,arr2,n,m);

    }

    static int[] mergeTwoArray(int arr1[], int arr2[], int n, int m) {
        int temp[] = new int[n + m];
        for (int i = 0; i < n; i++) {
            temp[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            temp[n + i] = arr2[i];
        }
        Arrays.sort(temp);
        return temp;
    }

    static void mergesort(int arr1[], int arr2[], int n, int m) {

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i]+" ");
                i++;
            } else {
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        while(i<n){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<m){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
}
