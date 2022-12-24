package DataStructureTheory.Stack;

import java.util.Stack;

public class RemoveConsequitiveDuplicates {
    public static void main(String[] args) {
        String str="aaaabaacdddf";
        String s = remove(str);
        System.out.println(s);


    }
    static String removeConsequitive(String str){
        String str1="";
        Stack<Character> st=new Stack<>();
        st.push(str.charAt(0));
        for (int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if (st.isEmpty()==false && st.peek()!=ch){
                str1=str1+Character.toString(st.pop());
                st.push(ch);
            }
        }
        str1=str1+st.pop();
        return str1;
    }
    static String remove(String str){
        Stack<Character> st= new Stack<>();

        st.push(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if (str.charAt(i)!=st.peek()){
                st.push(str.charAt(i));
            }
        }
        String str1="";
        while(st.isEmpty()==false){
            str1=str1+st.pop();
        }
        StringBuffer st1=new StringBuffer(str1);
        StringBuffer reverse = st1.reverse();
        str1= String.valueOf(reverse);
        return str1;
    }
}
