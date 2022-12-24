package DataStructureTheory.Recursion;

public class DigitINumber {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n) {

        // add your code here
        if(n%10==n || n==0)
            return 1;
        n = n/10;
        return 1 +countDigits(n);
    }
}
