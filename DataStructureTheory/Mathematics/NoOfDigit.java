package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long digit = digit(n);
        long digit1 = digitRecursive(n);
        long digit2 = digitLog(n);
        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digit2);

    }

    private static long digit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;


    }

    private static long digitRecursive(long n) {

        if (n == 0)
            return 0;
        return 1 + digitRecursive(n / 10);


    }

    private static long digitLog(long n) {

        return (long)Math.floor(Math.log10(n)+1);
    }


}
