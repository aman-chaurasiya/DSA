package DataStructureTheory.Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jugglereuense {
    public static void main(String[] args) {

        int n=6;
        ArrayList<Integer> arrayList = jugglerSequende(n);
        System.out.println(arrayList.toString());
        jum_sequence(n);
    }
    static ArrayList<Integer> jugglerSequende(int n){
       ArrayList<Integer> arr= new ArrayList<>();
        arr.add(n);
        while(n!=1){
            if (n%2==0)
                n= (int) Math.sqrt(n);
            else
                n=(int)Math.pow(Math.sqrt(n),3);
            arr.add(n);
        }
        return arr;
    }
    public static void jum_sequence(int N) {

        System.out.print(N + " ");

        if (N <= 1)
            return;
        else if (N % 2 == 0) {
            N = (int) (Math.floor(Math.sqrt(N)));
            jum_sequence(N);
        } else {
            N = (int) Math.floor(N * Math.sqrt(N));
            jum_sequence(N);
        }
    }
}
