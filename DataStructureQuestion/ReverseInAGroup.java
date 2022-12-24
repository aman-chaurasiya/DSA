package DataStructureQuestion;

import java.util.*;

public class ReverseInAGroup {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 9, 15, 17, 20};
        int n = arr.length;
        int k = 3;
        reverse(arr, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(9);
        arr1.add(15);
        arr1.add(17);
        arr1.add(20);
        reverse1(arr1, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr1.get(i) + " ");

    }

    private static void reverse1(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {

            int left = i;

            int right = Math.min(i + k - 1, n - 1);


            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }


    }

    private static void reverse(int[] arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }


    }
}
