package DataStructureTheory.Recursion;

public class DigitalRoots {
    public static void main(String[] args) {
        int n=567;
        System.out.println(digitalRoot(n));
    }
    public static int digitalRoot(int n)
    {
        // add your code here
        int sum=0;
        if(n<=9)
            return n;
        sum=n%10+digitalRoot(n/10);
        if(sum>9)
            return digitalRoot(sum);
        return sum;
    }
}
