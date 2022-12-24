package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class tralingZeroInFactorials {
    public static void main(String[] args) {
        Scanner scanne=new Scanner(System.in);
        long number=scanne.nextLong();

        long zeros = zeros(number);
        System.out.println(zeros);
    }

    private static long zeros(long n){
        int fac=1;
        for (int i=2;i<=n;i++){
            fac=fac*i;


        }
        System.out.println(fac);
        int res=0;
        while (fac%10==0){
            res++;
            fac=fac/10;

        }
        return res;
    }
}
