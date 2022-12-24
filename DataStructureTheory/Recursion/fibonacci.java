package DataStructureTheory.Recursion;

public class fibonacci {

//fibonacci is addition off last two numbers is equal to third number
    // 1,1,2,3,5,8,13,21....
    public static void main(String[] args) {
        int n=20;
        System.out.println(fibonacci(n));

    }
    static int fibonacci(int n){
        if (n==1 || n==2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }



}
