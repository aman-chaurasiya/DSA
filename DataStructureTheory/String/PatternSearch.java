package DataStructureTheory.String;

public class PatternSearch {
    public static void main(String[] args) {
        String a="abceabcdabceabcd";
        String b="abcd";
        int serch = serch(a, b);
        System.out.println(serch);

    }
    public static int serch(String a,String b){

        int n=a.length();
        int m=b.length();
        int i=0;
        int j=0;
        int count=0;
       while (i<n && j<m){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else{
                i++;
                j=0;
            }

        }
        if(j==b.length()){
            count++;
        }
       return count;

    }
}
