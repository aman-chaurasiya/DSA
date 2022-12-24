package DataStructureQuestion.LoveBabber.Array;

import java.util.Arrays;



public class reverseArrayAndString {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        int n = arr.length;
        reverse(arr, n);
        System.out.println(Arrays.toString(arr));
        String a = "geeksforgeeks";
        int size = a.length();

        String s = reverseString(a, size);
        System.out.println(s);
        int number =786;
        System.out.println(reverseNum(number));


    }

    private static int reverseNum(int number) {
        int n=0;

        while (number > 0) {

            n=n*10+number%10;
            number=number/10;

        }
        return n;
    }

    private static String reverseString(String a, int size) {
        String revstr = "";
        for (int i = size - 1; i >= 0; i--) {
            revstr = revstr + a.charAt(i);

        }
        return revstr;


    }

    private static void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
