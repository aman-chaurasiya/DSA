package DataStructureTheory.String;

public class BinaryString {
    public static void main(String[] args) {
       String str="1010101";
        int i = binarySubstring(str.length(), str);
        System.out.println(i);
    }
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count=0;
        for(int i=0;i<a;i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return (count*(count-1))/2;
    }
}
