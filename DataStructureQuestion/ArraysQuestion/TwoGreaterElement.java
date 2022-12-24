package DataStructureQuestion.ArraysQuestion;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TwoGreaterElement {
    //remove two greater element from array
    public static void main(String[] args) {
        long a[] = {7, -2, 3, 4, 9, -1};
        int N = a.length;

        long arr[] = new long[N - 2];
        Arrays.sort(a);
        for (int i = 0; i < N - 2; i++)
            arr[i] = a[i];
        System.out.println(Arrays.toString(arr));
    }

}
