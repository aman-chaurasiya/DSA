package DataStructureTheory.Array;

import java.util.Arrays;

public class SuffleArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 4, 7}, n = 3;

        int[] shuffle = shuffle(arr, n);
        System.out.println(Arrays.toString(shuffle));
    }

    public static int[] shuffle(int[] arr, int n) {
        int res[]=new int[2*n];
    for (int i=0;i<2*n;i++){
        if (i%2==0){
            res[i]=arr[i/2];
        }else{
            res[i]=arr[n+i/2];
        }
    }

    return res;
    }

}
