package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int digit = digit(n);
        System.out.println(digit);


    }

    private static int  digit(int n) {
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }

}
