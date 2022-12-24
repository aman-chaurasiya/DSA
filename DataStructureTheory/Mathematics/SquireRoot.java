package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class SquireRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long sqRoot = sqRoot(number);
        System.out.println(sqRoot);

    }

    private static long sqRoot(long number) {


        if (number == 0 || number == 1) {
            return number;
        }
        int result = 1, i = 1;
        while (result <= number) {
            i++;
            result = i * i;
        }
        return i-1 ;

    }


}
