package DataStructureTheory.String;

import java.util.Arrays;

public class LeftMostRepeting {
    public static void main(String[] args) {
        String str= "abcdeb";
        int i = repetingChar3(str);
        System.out.println(i);
    }

    private static int repetingChar(String str) {
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j))
                    return i;                           //O(N^2)
            }
        }
        return -1;
    }
    private static int repetingChar1(String str){
         int count[]=new int[256];
         for (int i=0;i<str.length();i++){
             count[str.charAt(i)]++;
         }
         for (int i=0;i< str.length();i++){
             if (count[str.charAt(i)]>1){    //O(n)+O(n)
                 return i;
             }
         }
         return -1;
    }
    private static int repetingChar2(String str){
        int fIndex[]=new int[256];
        Arrays.fill(fIndex,-1);
        System.out.println(Arrays.toString(fIndex));
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fi=fIndex[str.charAt(i)];
            if (fi==-1){
                fIndex[str.charAt(i)]=i;
            }else
                res=Math.min(res,fi);
        }
        return (res==Integer.MAX_VALUE)?-1:res;


    }
    private static int repetingChar3(String str){
        boolean visited[]=new boolean[256];
        int res=-1;
        System.out.println(Arrays.toString(visited));
        for (int i=str.length()-1;i>=0;i--){
            if (visited[str.charAt(i)]){
                res=i;
            }else
                visited[str.charAt(i)]=true;
        }
        System.out.println(Arrays.toString(visited));

        return res;
    }
}
