package DataStructureTheory.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {5, 15, 10, 8, 6, 12, 9, 18};
        int n = arr.length;
        ArrayList<Integer> integers = nextGreaterElement(arr, n);
        Collections.reverse(integers);
        System.out.println(integers);
    }

    static void nextGreater(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }

            }
            if (j == n) {
                System.out.print(-1 + " ");
            }

        }
    }

    static ArrayList<Integer> nextGreaterElement(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(arr[n - 1]);
        list.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i])
                st.pop();
            int nxtGretr = (st.isEmpty()) ? (-1) : (st.peek());
           list.add(nxtGretr);
            st.push(arr[i]);

        }
        return list;
    }


}
