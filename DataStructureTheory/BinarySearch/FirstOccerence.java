package DataStructureTheory.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstOccerence {
    public static void main(String[] args) {
        int[] arr = {5, 6,7,8,10,10, 20, 20};
        int n = arr.length;
        int x = 10;

        int index = firstOccerence(arr, n, x);
        System.out.println();

        System.out.println(index);


    }

    private static int firstOccerence(int[] arr, int n, int x) {
        Arrays.sort(arr);
       for (int i=0;i< arr.length;i++)
           System.out.print(arr[i]+" ");
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid-1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }


        }


        return -1;
    }
}
