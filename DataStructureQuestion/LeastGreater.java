package DataStructureQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class LeastGreater {
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, 1, 3, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] ints = leastGreater(arr, n);
        System.out.println(Arrays.toString(ints));
        ArrayList<Integer> integers = leastGreaterElement(arr, n);
        System.out.println(integers);


    }

    static int[] leastGreater(int[] arr, int n) {
        int res[] = new int[n];
        TreeSet<Integer> t = new TreeSet<>();
        for (int a : arr) {
            t.add(a);
        }
        for (int i = 0; i < n; i++) {
            if (t.higher(arr[i]) == null) {
                res[i] = -1;
            } else {
                res[i] = t.higher(arr[i]);
            }
            t.remove(arr[i]);


        }
        return res;
    }
    static ArrayList<Integer> leastGreaterElement(int arr[],int n){
        TreeSet<Integer>t= new TreeSet<>();
        ArrayList<Integer> res= new ArrayList<>();
        res.add(-1);
        t.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(t.higher(arr[i])==null){
                res.add(-1);
            }else{
                res.add(t.higher(arr[i]));
            }
            t.add(arr[i]);
        }
        Collections.reverse(res);
        return res;
    }
}
