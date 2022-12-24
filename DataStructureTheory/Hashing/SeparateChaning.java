package DataStructureTheory.Hashing;

import java.util.ArrayList;

public class SeparateChaning {
    public static void main(String[] args) {
        int arr[] = {92,4,14,24,44,91};
        int n=arr.length;
        int hashSize=10;
        ArrayList<ArrayList<Integer>> arrayLists = separateChaning(arr, n, hashSize);
        for (ArrayList list:arrayLists
             ) {
            System.out.println(list);
        }

    }
    public static ArrayList<ArrayList<Integer>> separateChaning(int arr[],int n,int hashSize){
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for (int i = 0; i < hashSize; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            list.get(arr[i]%hashSize).add(arr[i]);
        }
        return list;

    }
}
