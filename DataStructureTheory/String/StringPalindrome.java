package DataStructureTheory.String;

public class StringPalindrome {
    public static void main(String[] args) {
        String name="geegfofgeeg";


        boolean pal = isPal1(name);
        System.out.println(pal);
    }
   static boolean isPal(String str){
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        return str.equals(stringBuilder.toString());
    }
    static boolean isPal1(String str){
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if (str.charAt(low)!=str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;

    }
}
