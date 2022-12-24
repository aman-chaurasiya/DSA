package DataStructureTheory.String;

import java.util.Arrays;

import static java.sql.Types.CHAR;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean res = areAnagram1(s1, s2);
        System.out.println(res);


    }
    static boolean areAnagram1(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int count[]=new int[256];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<count.length;i++)
            if (count[i]!=0)
                return false;


        return true;
    }

    static boolean areAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s1 = new String(a);
        s2 = new String(b);


        return s1.equals(s2);

    }


}
