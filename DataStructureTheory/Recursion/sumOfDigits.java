package DataStructureTheory.Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=999999;
        int sum= sumofdigit(n);
        System.out.println(sum);
        int a=9;
        System.out.println(a/10);
        System.out.println(a%10);
    }

    private static int sumofdigit(int n) {
        if(n==0)
        return 0;
        return(n%10+sumofdigit(n/10));
    }
}
