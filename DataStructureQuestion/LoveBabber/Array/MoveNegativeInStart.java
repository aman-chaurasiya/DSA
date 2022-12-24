package DataStructureQuestion.LoveBabber.Array;

import java.util.Arrays;

public class MoveNegativeInStart {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        moveBegning(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void moveBegning(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;

                }
            }
        }

    }
}
