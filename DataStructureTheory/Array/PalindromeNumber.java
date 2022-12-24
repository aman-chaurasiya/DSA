package DataStructureTheory.Array;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean palindrome = palindrome(n);
        System.out.println(palindrome); ;

    }

    private static boolean palindrome(int n) {
        int rev = 0;
        int temp = n;

        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;

        }

             return rev==n;

    }
}
