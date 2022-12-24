package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        double factoial = factoial(n);
        System.out.println(factoial);
        double facto = facto(n);
        System.out.println(facto);
    }

    private static double factoial(double n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }


    private static double facto(double n) {
        if (n == 0)
            return 1;
        return n * facto(n - 1);
    }
}
