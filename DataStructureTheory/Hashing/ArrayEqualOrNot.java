package DataStructureTheory.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        long []arr={1,2,2,3,4,4};
        long []brr={1,2,2,3,4,2};
        int n= arr.length;
        System.out.println( equalOrNot1(arr,brr,n));
    }
    private static boolean equalOrNot(long []arr,long brr[],int n){
        HashSet<Long> hast= new HashSet<>();
        for (int i = 0; i < n; i++) {
            hast.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if (!hast.contains(brr[i])){
                return false;
            }
        }
        return true;

    }
    private static boolean equalOrNot1(long []arr,long brr[],int n) {
        HashMap<Long, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == null)
                map.put(arr[i], 1);
            else {
                count = map.get(arr[i]);
                count++;
                map.put(arr[i], count);
            }
        }
        for (int i = 0; i < n; i++) {
            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(brr[i]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(brr[i]) == 0)
                return false;

            count = map.get(brr[i]);
            --count;
            map.put(brr[i], count);
        }

        return true;
    }


}
