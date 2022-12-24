package DataStructureTheory.String;

import java.util.Arrays;

public class LeftMostNonRepeting {
    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(leftmostNonRepting3(str));
    }

    public static int leftmostNonRepting(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }

            }
            if (flag == false)
                return i;
        }
        return -1;

    }

    private static int leftModtNonrepting2(String str){
        int []count=new int[256];

        for (int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for (int j = 0; j < str.length(); j++) {
            if (count[str.charAt(j)]==1)
                return j;

        }
        return -1;

    }
    private static int leftmostNonRepting3(String str){
        int nonreo[]=new int[256];
        Arrays.fill(nonreo,-1);
        for (int i=0;i<str.length();i++){
            if (nonreo[str.charAt(i)]==-1){
                nonreo[str.charAt(i)]=i;
            }else
                nonreo[str.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (nonreo[i]>=0){
                res= Math.min(res,nonreo[i]);
            }

        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
}
