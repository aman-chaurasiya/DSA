package DataStructureQuestion.ArraysQuestion;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr[] = {8,1, 2, 3, 9, 10};
        int arr1[] = {1, 2, 6, 4, 5};
        int n = arr.length;
        Set set = new HashSet();
        for (int x : arr)
            set.add(x);
        for (int x : arr1)
            set.add(x);

        for (Object s : set)
            System.out.print(s + " ");

       // System.out.println(set.size());

    }
}
