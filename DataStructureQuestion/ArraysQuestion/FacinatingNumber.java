package DataStructureQuestion.ArraysQuestion;

import java.util.Arrays;

public class FacinatingNumber {
    public static void main(String[] args) {
        //multiply number by1 and by2 and by3 and concate all
        // then if number consist 1-9 then number is facinating otherwise  no;
        long num = 327;
        String n = num + "" + (num * 2) + "" + (num * 3);
        //  System.out.println(n);
        char[] str = n.toCharArray();
        //System.out.println(str);
        Arrays.sort(str);
        System.out.println(str);
        char[] res = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(res);
        if (Arrays.equals(str, res)) {
            System.out.println(true);

        } else
            System.out.println(false);

    }
}
