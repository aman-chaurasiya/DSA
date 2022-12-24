package DataStructureTheory.Array;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MaximumOfAllSubArraysOfSizeK {
    public static void main(String[] args) {
        int []arr={9,2,3,1,4,5,2,3,6};
        int size=arr.length;
        int k=3;
        System.out.println(mazimumOfAllSubArrays(arr,k,size));

    }
    public static ArrayList<Integer> mazimumOfAllSubArrays(int arr[],int k,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            int max=0;
            for(int j=i;j<i+k;j++){
                if (arr[j]>max){
                    max=arr[j];
                }
            }
            ans.add(max);

        }
        return ans;
    }
}
