package DataStructureTheory.String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abhishek";
        String reverse = reverse(str);
        System.out.println(reverse);

       reverseSentence("My name is aman");


    }

    public static String reverse(String str) {

        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans = ans.concat(String.valueOf(str.charAt(i)));
        }
        return ans;
    }

    public static void  reverseSentence(String str) {
        String[] s1 = str.split(" ");
        System.out.println(Arrays.toString(s1));
        for (int i = 0; i < s1.length; i++) {
            String temp = s1[i];
            System.out.println(temp);
            s1[i] = reverse(temp);
        }
        String Aman=Arrays.toString(s1);
        System.out.println(Aman);
    }
}
