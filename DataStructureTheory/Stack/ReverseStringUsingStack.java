package DataStructureTheory.Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str="AMAN CHAURASIYA";
        String reverse = reverse(str);
        System.out.println(reverse);

    }
    public static String reverse(String S){
        //code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        String str="";
        for(int i=0;i<S.length();i++){
            str=str+st.pop();
        }
        return str;
    }
}
