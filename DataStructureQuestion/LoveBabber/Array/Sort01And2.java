package DataStructureQuestion.LoveBabber.Array;

import java.util.Arrays;

public class Sort01And2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,0,1,2,1, 2, 2, 0, 2};
        int n = arr.length;
          sort012(arr,n);
          System.out.println(Arrays.toString(arr));

        sortByCount(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    private static void sortByCount(int[] arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int a = 0; a < n; a++) {
            if (arr[a] == 0)
                cnt0++;
            else if (arr[a] == 1)
                cnt1++;
            else
                cnt2++;
        }
        int count = 0;
        for (int i = 0; i < cnt0; i++) {
            arr[count] = 0;
            count++;
        }

        for (int j = 0; j < cnt1; j++) {
            arr[count] = 1;
            count++;
        }
        for (int k = 0; k < cnt2; k++) {
            arr[count] = 2;
            count++;
        }


    }

    static void sort012(int[] arr, int n) {
        int l = 0, r = n - 1, mid = 0, temp = 0;
        while (mid <= r) {
            switch (arr[mid]) {
                case 0: {

                    temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp;
                    l++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;

                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[r];
                    arr[r] = temp;
                    r--;
                    break;
                }

            }


        }
    }
}
