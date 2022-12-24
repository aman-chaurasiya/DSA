package DataStructureQuestion.ArraysQuestion;

import java.util.Arrays;

public class EvenOddSegerigate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int n = arr.length;
        segregateEvenOdd(arr, n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void segregateEvenOdd(int arr[], int n) {
        // code here

        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        int[] odd = new int[n-evenCount];
        int[] even = new int[evenCount];

        int item = 0;

        for (int i = 0 ; i < n; i++) {
            if(arr[i] % 2 == 0) {
                even[item] = arr[i];
                item++;
            }
        }
        item = 0;
        for (int j = 0 ; j < n; j++) {
            if(arr[j] % 2 != 0) {
                odd[item] = arr[j];
                item++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);


        int merge = 0;
        while(merge < evenCount) {
            arr[merge] = even[merge];
            merge++;
        }
        int t = 0;
        while(merge < n) {
            arr[merge] = odd[t];
            merge++;
            t++;
        }


    }
}
