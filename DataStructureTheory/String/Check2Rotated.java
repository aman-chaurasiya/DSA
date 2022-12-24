package DataStructureTheory.String;

import java.util.Arrays;

public class Check2Rotated {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
      //  System.out.println(Arrays.toString(isRotated(str1, str2)));
        System.out.println(str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2));
        System.out.println(str1.substring(2));

    }

    public static String[] isRotated(String str1, String str2) {
        // Your code here
        String s=str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);
        String s3=str1.substring(2)+str1.substring(0,2);
        String []strResult= new String[2];
        strResult[0]=s;
        strResult[1]=s3;
        return strResult;
    }
}
