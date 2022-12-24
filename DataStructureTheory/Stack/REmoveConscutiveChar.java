package DataStructureTheory.Stack;

public class REmoveConscutiveChar {
    public static void main(String[] args) {

    }
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        int i=0;
        int j=i+1;
        String str1 = String.valueOf(str.charAt(i));
        while(j<str.length()){
            if(str.charAt(i)==str.charAt(j)){
                i++;

                j++;
            }else{
                str1=str1+str.charAt(j);
                i++;
                j++;
            }
        }
        return str1;
    }
}
