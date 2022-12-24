package DataStructureTheory.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestRectengularArea {
    public static void main(String[] args) {
        long[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        int n = arr.length;
         long i = getMaxArea(arr, n);
         System.out.println(i);
         List<Boolean> list= new ArrayList<>();

    }

    static int largestArea(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
                ;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    static int largestRectengulerArea(int arr[], int n) {

        int res=0;
        int[] preSmallerElement = preSmallerElement(arr, n);
        int[] nextSmaller = nextSmaller(arr, n);
        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-preSmallerElement[i]-1)*arr[i];
            curr+=(nextSmaller[i]-i-1)*arr[i];
            res=Math.max(res,curr);
        }
        return res;


    }

    static int[] preSmallerElement(int arr[], int n) {
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    arr1[i] = j;
                    break;
                }

            }
            if (j == -1)
                arr1[i] = -1;
        }
        return arr1;
    }

    static int[] nextSmaller(int arr[], int n) {
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    arr1[i] = j;
                    break;
                }

            }
            if (j == n) {
                arr1[i] = n;
            }

        }
        return arr1;
    }
    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stk = new Stack<>();
        int[] next = new int[hist.length];
        int[] prev = new int[hist.length];
        st.push(-1);

        //next smaller
        for(int i=hist.length-1;i>=0;i--){
            while(st.peek()!=-1 && hist[st.peek()]>= hist[i]) st.pop();
            next[i]=st.peek();
            st.push(i);
        }
        //prev smaller
        stk.push(-1);
        for(int i=0;i<hist.length;i++){
            while(stk.peek()!=-1 && hist[stk.peek()]>= hist[i]) stk.pop();
            prev[i]=stk.peek();
            stk.push(i);
        }
        //final
        long ans= Long.MIN_VALUE;
        for(int i=0;i<hist.length;i++){
            if(next[i]== -1) next[i]=hist.length;
            ans = Math.max((next[i]-prev[i]-1)* hist[i],ans);
        }
        return ans;

    }
}
