package DataStructureQuestion.ArraysQuestion;

import java.util.Arrays;

public class ConvertArrayInZigZac {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};

        convertArr(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void convertArr(int []arr,int n){
        boolean flag=true;
        int temp=0;
        for(int i=0;i<n-1;i++){
            if (flag){
                if (arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }else {
                if (arr[i]<arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag=!flag;
        }

    }



}
