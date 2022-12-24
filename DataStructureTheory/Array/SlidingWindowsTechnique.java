package DataStructureTheory.Array;

import javax.swing.*;

public class SlidingWindowsTechnique {
    public static void main(String[] args) {

        int[] arr = {50, 8, 30, -5, 20, 100};
        int k=3;
        int n=arr.length;
        int maxSum = maxsum2(arr, n, k);
        System.out.println(maxSum);

    }


    static int maxSum(int[] arr, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += arr[i + j];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }




    static int maxsum2(int []arr,int n,int k){
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+3;j++)
                sum+=arr[j];
                maxsum = Math.max(maxsum, sum);

        }
        return maxsum;

    }
}
