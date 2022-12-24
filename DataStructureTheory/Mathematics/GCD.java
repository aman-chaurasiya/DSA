package DataStructureTheory.Mathematics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int firstNumber =sc.nextInt();
        int secondNumber =sc.nextInt();
        int i = gcdOfTwoNumber(firstNumber, secondNumber);
        System.out.println(i);


    }
   private static int gcdOfTwoNumber(int a,int b){
        int min=Math.min(a,b);
        while (min>0){
            if (a%min==0 && b%min==0){
                break;
            }
            min--;
        }
        return min;


    }

}

