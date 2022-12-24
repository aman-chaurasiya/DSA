package DataStructureTheory.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int arr[] = {1, 5, 9, 6, 7, 8, 11, 1, 2, 3, 4, 5, 6, 7, 8, 7, 9, 9, 85, 21, 321, 616, 51, 13, 21, 651, 51, 651, 65};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {


            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int idx = 0;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;


        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }

        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

    }
}
