package DataStructureQuestion.ArraysQuestion;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int i = missingNumber(arr, n);
        System.out.println(i);
    }


    private static int missingNumber(int[]arr,int n){
        int res=0;
        int sum=(n*(n+1))/2;
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            res=res+arr[i];
        }
        return (sum-res);

    }
}
