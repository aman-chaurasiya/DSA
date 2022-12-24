package DataStructureQuestion.ArraysQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInAGroup {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int n=list.size();
        int k=3;
        reverseInGroups(list,n,k);
        System.out.println(list);
    }

    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            if (i + k < n) {
                Collections.reverse(arr.subList(i, i + k));
            } else {
                Collections.reverse(arr.subList(i,n));
            }
        }

    }
}
