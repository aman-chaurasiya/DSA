package DataStructureTheory.Mathematics;

public class DIgitInFactorials {
    public static void main(String[] args) {
        int N=19;
        DIgitInFactorials dIgitInFactorials=new DIgitInFactorials();
       // int i = dIgitInFactorials.digitsInFactorial(N);
      //  System.out.println(i);
//        int factorial = dIgitInFactorials.factorial(N);
//        System.out.println(factorial);
        int i = dIgitInFactorials.digitsInFactorial1(N);
        System.out.println(i);
    }
    public  int digitsInFactorial(int N){
        // code here
        int fact=factorial(N);
        int count=0;
        while(fact>0){
            fact= fact/10;
            count++;

        }
        return count;
    }
    int  factorial(int N){
        if(N==0)
            return 1;
        return N*factorial(N-1);
    }
    public int digitsInFactorial1(int N)
    {


        if (N < 0)
            return 0;


        if (N <= 1)
            return 1;


        double digits = 0;
        for (int i=2; i<=N; i++)
            digits += Math.log10(i);

        return (int)(Math.floor(digits)) + 1;
    }

}
