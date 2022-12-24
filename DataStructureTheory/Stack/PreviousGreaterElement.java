package DataStructureTheory.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {

        int arr[] = {5, 10, 30, 40, 50};
        int n = arr.length;
        //  int[] ints = preGreaterElement(arr, n);
        //   System.out.println(Arrays.toString(ints));
        List<Integer> integers = smallestNumberOnLeft(arr, n);
        System.out.println(integers);
    }

    static int[] preGreaterElement(int arr[], int n) {
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    arr1[i] = arr[j];
                    break;
                }
            }
            if (j == -1)
                arr1[i] = -1;
        }
        return arr1;
    }

    static List<Integer> smallestNumberOnLeft(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push((arr[i]));
        }
        return list;
    }
}
