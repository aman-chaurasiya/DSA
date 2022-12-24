package DataStructureTheory.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[]={0,3,1,2};
        int n= arr.length;
        ArrayList<Integer> duplicates = duplicates1(arr, n);
        System.out.println(duplicates);
    }
     static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int []preArr=new int[n];
        for(int i=0;i<n;i++){
            if(preArr[arr[i]]>=1){
                list.add(arr[i]);
            }
            else{
                preArr[arr[i]]++;
            }
        }

           return list;

    }
    public static ArrayList<Integer> duplicates1(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> h = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue() >1){
                ans.add(e.getKey());
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        Collections.sort(ans);
        return ans;
    }
}
