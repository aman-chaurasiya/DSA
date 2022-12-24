package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class EculidianForGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();


        int i = eculidianBasic(firstNumber, secondNumber);
        System.out.println("By Basic eculidian "+i);
        int i1 = eculidianBest(firstNumber, secondNumber);
        System.out.println("By best eculidian "+i);
    }

    private static int eculidianBasic(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;


    }

    private static int eculidianBest(int a,int b){
         if (b==0)
             return a;
         else
             return eculidianBest(b,a%b);
    }

}