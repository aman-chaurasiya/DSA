package DataStructureTheory.String;

import java.util.ArrayList;
import java.util.Arrays;

public class NaivePatterSearch {
    public static void main(String[] args) {
    String txt="aabaacaadaabaaabaa";
    String pat="aaba";
    ArrayList<Integer> arr = search(txt,pat);
        System.out.println(arr);
    }

    private static ArrayList<Integer> search(String txt, String pat) {
        int n=txt.length();
        int m=pat.length();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<=n-m;i++){
            int j;
            for (j=0;j<m;j++){
                if (pat.charAt(j)!=txt.charAt(i+j))
                    break;
            }
            if(j==m){
                arr.add(i);
            }
        }
        return arr;
    }

}
