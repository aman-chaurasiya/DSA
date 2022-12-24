package DataStructureTheory.Array;

import java.util.Arrays;

public class TrappingRain {
    public static void main(String[] args) {
        int arr[] = {8, 8, 2, 4, 5, 5, 1};
        int n=arr.length;
        long water = trappingWater(arr, n);
        System.out.println(water);

    }


    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        long res = 0;
        long[] lMax = new long[n];
        long[] rMax = new long[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }
        System.out.println(Arrays.toString(lMax));
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        System.out.println(Arrays.toString(rMax));
        for (int i = 1; i < n - 1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;
    }

}
