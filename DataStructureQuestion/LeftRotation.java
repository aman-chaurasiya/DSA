package DataStructureQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        int arr[] = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2 ,98 ,3 ,18 ,93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10 ,28 ,68, 57, 98, 54, 87, 66, 7 ,84, 20, 25, 29, 72, 33, 30, 4 ,20, 71, 69, 9 ,16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65 ,25};
        int n = arr.length;
        int d = 69;


        d=d%n;
        System.out.println(d);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        for (int i = 0; i < d; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
        //leftRotate by one

      /*  leftRotateByOne(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");*/

        //leftRotateBy 2 time
      /*  for (int j = 0; j < 2; j++) {
            leftRotateByOne(arr, n);
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");*/


        //leftrotate by d time.

        //    leftRotateByD(arr, n, d);

        leftRotateByDBestMethod(arr, n, d);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


    }







    private static void leftRotateByD(int[] arr, int n, int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }


    }

    private static void leftRotateByOne(int[] arr, int n) {

        int temp = arr[0];
        for (int i = 1; i < n; i++)
            arr[i - 1] = arr[i];
        arr[n - 1] = temp;


    }


    private static void leftRotateByDBestMethod(int[] arr, int n, int d) {
        revese(arr, 0, d - 1);
        revese(arr, d, n - 1);
        revese(arr, 0, n - 1);


    }

    private static void revese(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
}
