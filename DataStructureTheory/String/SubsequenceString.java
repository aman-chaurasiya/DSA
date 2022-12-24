package DataStructureTheory.String;

public class SubsequenceString {

    public static void main(String[] args) {
        String s1="GEEKSFORGEEKS";
        String s2="GRGESA";
        int n=s1.length();
        int m=s2.length();
       // System.out.println(subSequence(s1,s2,n,m));

        System.out.println(subsequence2(s1,s2));
    }

   public static boolean subsequence2(String s1,String s2){
        int j=0;
        int i=0;
        while(i<s1.length() && j<s2.length()){
            if (s1.charAt(i)==s2.charAt(j)){
                j++;
                i++;
            }
            else{
                i++;

            }
        }
        return (j==s2.length());


    }
    static boolean subSequence(String s1,String s2,int n,int m){
        int j=0;
        for (int i=0;i<n && j<m;i++){
            if (s1.charAt(i) == s2.charAt(j))
                j++;
        }
        return (j==m);

    }





}
