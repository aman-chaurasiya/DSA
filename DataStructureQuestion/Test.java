package DataStructureQuestion;


import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int i, n=5;
        int[] arr ={5,4,3,2,1};

        for ( i = 0 ;i<= n - 2;i++){
            arr[i] = arr[i] - arr[i+1];
        }
        System.out.println(Arrays.toString(arr));


     /*   14
        7 12 1 17 14 3 11 17 2 6 6 5 8 17*/


    }
}
