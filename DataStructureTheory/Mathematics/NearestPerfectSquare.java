package DataStructureTheory.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NearestPerfectSquare {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=1;
        nearestSquare(n);


      /*  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(read.readLine());
        while(t-->0){
            int N=Integer.parseInt(read.readLine());
            Solution ob=new Solution();
            int ans=ob.nearestSquare(N);
            System.out.println(ans);
        }*/

    }
    public static int nearestSquare(int n){
        int fsqrtN=(int)Math.floor(Math.sqrt(n));
        int csqrtN=(int)Math.ceil(Math.sqrt(n));
        int ceilSquare=csqrtN*csqrtN;
        int fsquare=fsqrtN*fsqrtN;

        if (csqrtN==fsqrtN){
            System.out.println("perfect sqrt");
        }else{
           if(Math.abs(fsquare-n)>Math.abs(ceilSquare-n)){
               System.out.println(ceilSquare);
           }else{
               System.out.println(fsquare);
           }
        }
        return fsqrtN;
    }
}
