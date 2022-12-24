package DataStructureTheory.Array;

public class EqulibriumPoint {
    public static void main(String[] args) {
        long []arr={1,3,5,2,2,7};
        int n=arr.length;
        int i = equilibriumPoint(arr, n);
        System.out.println(i);
    }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        if( n == 1) return 1;
        int l = 0 ;
        int r = 0 ;
        for(int i = 1; i < n ; i++) r += arr[i];
        for(int i = 1 ; i < n ; i++)
        {
            l += arr[i-1];
            r -= arr[i];
            if(l == r) return i+1;
        }
        return -1;
    }
}
