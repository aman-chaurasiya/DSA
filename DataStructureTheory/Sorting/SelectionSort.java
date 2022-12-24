package DataStructureTheory.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 10, 5, 7, 8, 9};
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                }
            }
            if (min_indx != i) {
                int temp = arr[min_indx];
                arr[min_indx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
