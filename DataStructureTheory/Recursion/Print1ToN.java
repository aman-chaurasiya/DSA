package DataStructureTheory.Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        printNumber(i,n);
        System.out.println("");
        printNto1(n);
    }

    private static void printNumber(int i, int n) {
        if (i>n)
            return;
        System.out.print(i+" ");
        printNumber(i+1,n);
    }
    static void printNto1(int n){
        if (n==0)
            return;
        System.out.print(n+" ");
        printNto1(n-1);

    }
}
