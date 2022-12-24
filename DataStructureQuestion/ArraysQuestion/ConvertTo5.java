package DataStructureQuestion.ArraysQuestion;

public class ConvertTo5 {
    public static void main(String[] args) {
        int n=1004;

        int num=convert5(n);
        System.out.println(num);
    }

    private static int convert5(int n) {
        int temp=0;
        while(n>0)
        {
            int ld=n%10;
            if (ld==0){
                ld=5;
            }
            temp=temp*10+ld;
            n=n/10;
        }

        int num = reverseNum(temp);
        return num;
    }

  public static   int reverseNum(int n){
      int rev=0;
        while(n>0){
            int ld=n%10;
           rev = rev*10+ld;
           n=n/10;
        }

        return rev;
    }




}
