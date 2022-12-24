package DataStructureTheory.String;

import java.util.Arrays;

public class FrequencyOfCherecter {
    public static void main(String[] args) {
 String str="geeksforgeeks";
        int[] frequency = frequency(str);
       // System.out.println(Arrays.toString(frequency));
    }
    public static int[] frequency(String str){
        int count[]=new int[26];
        for (int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if (count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
        return count;
    }
}
