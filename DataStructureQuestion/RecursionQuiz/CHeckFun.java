package DataStructureQuestion.RecursionQuiz;

public class CHeckFun {
    public static void main(String[] args) {
       int x=3,y=4;
        System.out.println(fun(3,4));
        System.out.println(fun(2));
        fun1(25);
        System.out.println();
        System.out.println(fun2(x,y));
        System.out.println(f(11));
    }
  static   int fun(int x, int y)

    {

        if (x == 0)

            return y;

        return fun(x - 1,  x + y);

    }
   static int fun(int n)

    {

        if (n == 4)

            return n;

        else return 2*fun(n+1);

    }

   static void fun1(int n)

    {

        if (n == 0)

            return;


        System.out.print(n%2);//("%d", n%2);

        fun1(n/2);

    }
  static   int fun2(int x, int y)

    {

        if (y == 0)   return 0;

        return (x + fun2(x, y-1));

    }

  static   int f(int n)

    {

        if(n <= 1)

            return 1;

        if(n%2 == 0)

            return f(n/2);

        return f(n/2) + f(n/2+1);

    }
}
