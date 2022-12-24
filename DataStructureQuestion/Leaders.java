package DataStructureQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
//for simple or naive method O(n^2)
        leaders(arr, n);
        System.out.println();
        //for O(n)
        leader(arr, n);
        System.out.println();
        ArrayList<Integer> arrayList = leaders1(arr, n);
        System.out.println(arrayList);

    }

    private static ArrayList<Integer> leaders1(int[] arr, int n) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[n - 1]);
        int b = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arrayList.get(b) < arr[i]) {
                arrayList.add(arr[i]);
                b++;
            }
        }
        Collections.reverse(arrayList);

        return arrayList;
    }

    private static void leader(int[] arr, int n) {

        int curr_ledr = arr[n - 1];
        System.out.print(curr_ledr + ",");
        for (int i = n - 2; i >= 0; i--) {
            if (curr_ledr < arr[i]) {
                curr_ledr = arr[i];
                System.out.print(curr_ledr + ",");
            }
        }


    }

    static void leaders(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(arr[i] + ",");
            }
        }

    }


}
