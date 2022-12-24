package DataStructureTheory.Array;

import java.util.Arrays;
import java.util.Collections;

public class SmallestSubsetGreatestSum {
    public static void main(String[] args) {

        Integer[] arr = { 30,40,20,10,10, 20, 30, 40,50,60 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        int n= arr.length;
        int i = samllestSubsetGretestSum(arr, n);
        System.out.println(i);
    }

    static int samllestSubsetGretestSum(Integer[] arr, int n) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        int count=0;
        int curr=0;
        for (int i=n-1;i>=0;i--){
            curr+=arr[i];
            sum-=arr[i];
            count++;
            if (curr>sum){
                return count;
            }
        }
        return count;
    }
}
