package DataStructureTheory.Stack;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Stack;



public class ParanthiesChecker {
    public static void main(String[] args) {

        String str = "()";
        boolean res = isPar(str);
        System.out.println(res);



    }

    static boolean isPar(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
            } else {
                if (st.isEmpty())
                    return false;
                else if (!matching(st.peek(), x)) {
                    return false;

                } else {
                    st.pop();
                }
            }
        }
        return (st.isEmpty()==true);
    }

    static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));
    }
}
