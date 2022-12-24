package DataStructureTheory.Sorting;

import java.util.HashSet;

public class Findtripletswithzerosum {
    public static void main(String[] args) {
        int arr[] = {0,4, 3, 2, -3, -7};
            int n= arr.length;
        System.out.println(findTriplets(arr,n));
    }
    public static boolean findTriplets(int arr[] , int n)
    {
        HashSet<Integer> set = new HashSet<Integer> ();


        for(int i=0 ; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(set.contains(-(arr[i] + arr[j]))){
                    return true;
                }

            }
            set.add(arr[i]);
        }
        return false;

    }
}
