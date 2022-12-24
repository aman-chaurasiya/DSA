package DataStructureQuestion;

import java.util.Arrays;

public class BulbQue {
    public static void main(String[] args) {
        int n=100;
      bulbRes(n);

    }
    public static void bulbRes(int n){
        String [] res=new String[n];
        for (int i = 1; i <=n ; i++) {
            double sqrt=Math.sqrt(i);
            double floor=Math.floor(sqrt);
            if(sqrt-floor==0){
                System.out.print("On ");
            }else{
                System.out.print("Off ");
            }
        }

    }
}
