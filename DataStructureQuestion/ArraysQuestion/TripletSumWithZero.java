package DataStructureQuestion.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class TripletSumWithZero {
    public static void main(String[] args) {
        int arr[]={42, -21, 13, -26, 79, 40, 62, -60, 29, -23, 97 ,-39, 40 ,-35, 26, -54, 87, 5 ,77 ,21 ,28 ,10 ,32 ,-22 ,  25 ,21 ,3};
        int n=arr.length;
        boolean triplets = findTriplets(arr, n);
        System.out.println(triplets);
    }
    public static boolean findTriplets(int arr[] , int n)
    {

        //add code here.
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;j<n;j++){
                    if (arr[i]+arr[j]+arr[k]==0)

                        return true;

                }
            }

        }
        return false;
    }
}
