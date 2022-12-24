package DataStructureTheory.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbers {
    public static void main(String[] args) {
        int n=10;
        ArrayList<String> generate = generate(n);
        System.out.println(generate);


    }
    static ArrayList<String> generate(int n){
        ArrayList<String> arr= new ArrayList<>();
        Queue<String> q= new LinkedList<>();
        String one="5";
       // String two="6";
        q.add(one);
       // q.add(two);

        for(int i=0;i<n;i++){
            String curr= q.remove();
            arr.add(curr);
            q.add(curr+one);
           // q.add(curr+two);

        }
return arr;

    }

}
